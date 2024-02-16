package ch_01.day240214_16;

import java.sql.SQLException;
import java.util.Scanner;

public class DBInsert extends DB {
    private User setUser() throws SQLException {
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        boolean validate = false;
        String validateTemp;
        do {
            System.out.println("신규 회원의 아이디를 입력하세요 (영어나 숫자, 이전 데이터에서 사용한 값은 안됨) : ");
            user.userID = scanner.nextLine();
            if (isDupUserID(user.userID)) {
                System.out.println(user.userID + "는 중복되는 아이디입니다. ");
                validate = true;
                continue;
            }
            System.out.println("신규 회원의 이름을 입력하세요 : ");
            user.name = scanner.nextLine();
            System.out.println("신규 회원의 나이를 입력하세요 : ");
            user.age = Integer.parseInt(scanner.nextLine());
            System.out.println("신규 회원의 직업을 입력하세요 : ");
            user.job = scanner.nextLine();

            System.out.println("신규 회원 : " + user.userID + " / " + user.name
            + " / " + user.age + " / " + user.job + "이 맞습니까? (y/n)");
            validateTemp = scanner.nextLine();

            validate = !validateTemp.equals("y");
        } while (validate);

        scanner.close();
        return user;
    }

    public void insertUser() throws SQLException {
        User user = setUser();
        if (isDupUserID(user.userID)) {
            System.out.println(user.userID + "는 중복되는 아이디입니다.");
            return;
        }

        // 매개변수화된 SQL 문 작성
        String insertSql = " INSERT INTO tUser (userID, name, age, job ) VALUES (?, ?, ?, ?) ";

        preparedStatement = conn.prepareStatement(insertSql);
        preparedStatement.setString(1, user.userID);
        preparedStatement.setString(2, user.name);
        preparedStatement.setInt(3, user.age);
        preparedStatement.setString(4, user.job);

        // SQL 문 실행
        int rows = preparedStatement.executeUpdate(); // executeUpdate()을 호출하면 sql문이 실행.
        // 영향을 받은 데이터 갯수(정수) 반환.
        // pstmt.excuteQuery() : select
        // pstmt.excuteUpdate() : insert, update, delete ...

        // insert의 경우 정상적으로 실행이 되었으면 1을 리턴.
        if (rows == 1) {
            System.out.println("데이터 입력에 성공했습니다.");
        } else {
            System.out.println("데이터 입력에 실패했습니다.");
        }
    }

    private boolean isDupUserID(String userID) throws SQLException {
        int totalRow; // 레코드 수를 저장
        String sql = "SELECT * FROM tUser WHERE userID = ?";

        preparedStatement = conn.prepareStatement(sql); // 쿼리 실행 준비
        // ?에 들어갈 값을 지정해주는데, ?는 순서에 따라 1번부터 번호가 부여
        preparedStatement.setString(1, userID);
        resultSet = preparedStatement.executeQuery();

        // ResultSet의 개수를 구하는 메서드는 없어서 다른 방법으로 개수를 구함
        resultSet.last(); // 마지막 row로 이동
        totalRow = resultSet.getRow(); // row count를 추출
        resultSet.beforeFirst(); // 처음 row로 커서를 이동. (초기 상태로 돌아감)

        return totalRow == 1;
    }

    private boolean isDupUserID2(String userID) throws SQLException {
        int totalRow;
        String sql = "SELECT COUNT(*) FROM tUser WHERE userID = ?";

        preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setString(1, userID);
        resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return resultSet.getInt(1)>0;

    }
}