package ch_01.day240214;

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
}
