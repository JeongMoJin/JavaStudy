package teamProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccountDao {
    private Connection connection = null;

    AccountDao() {getConnection();}
    private void getConnection() { // 디비 연결 생성자에서 실행
        try {
            String url = "jdbc:mariadb://localhost:3306/team_project";
            String user = "root";
            String password = "4532";

            try {
                Class.forName("org.mariadb.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } // 데이터 베이스 연결
    boolean insertMember(Member member) {
        String sql = "INSERT INTO team_project.member VALUES (?,?,?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, member.getId());
            preparedStatement.setString(2, member.getMember_id());
            preparedStatement.setString(3, member.getName());
            preparedStatement.setInt(4, member.getAge());
            preparedStatement.setString(5, member.getAddress());

            return preparedStatement.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } // 회원 등록 디비 처리
    boolean insertAccount(Account account) {
        String sql = "INSERT INTO team_project.account VALUES (?,?,?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, account.getId());
            preparedStatement.setString(2, account.getMember_id());
            preparedStatement.setString(3, account.getAccount_type());
            preparedStatement.setString(4, account.getAccount_number());
            preparedStatement.setDouble(5, account.getBalance());
            preparedStatement.setDouble(5, account.getInterest_rate());
            preparedStatement.setDouble(5, account.getFee_rate());

            return preparedStatement.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } // 계좌 개설 디비 처리
    void insertAccountHistory(AccountHistory accountHistory){}  // 거래 내역 저장
    ArrayList<AccountHistory> selectAccountHistories(String accountId) // 특정 계좌 번호에 대한 거래 내역 조회
//    void disConnect(); // 데이터 베이스 연결 해제
//    Account selectAccount(String accountId); // 특정 계좌 번호의 정보를 가져옴
//    double selectBalance(String accountId); // 특정 계좌 번호의 잔액을 가져옴
//    void updateBalance(String accountId, double balance); // 특정 계좌 번호의 잔액을 수정
//    int selectAccountIdCnt(String accountId); // 해당 계좌번호의 계좌 개수를 반환
//    int selectMemberIdCnt(String memberId); // 해당 아이디의 회원 개수를 반환

    }




