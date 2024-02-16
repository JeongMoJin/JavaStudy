package ch_01.day240214_16;

import java.sql.*;

public class DB {
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public void connectDB() {
        // 접속 정보
        final String driver = "org.mariadb.jdbc.Driver"; // JDBC 드라이버
        final String DB_HOST = "127.0.0.1"; // DB IP
        final String DB_PORT = "3306"; // DB PORT 번호
        final String DB_NAME = "sample"; // 접속 데이터베이스 이름
        final String DB_URL = "jdbc:mariadb://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME; // 경로 URL 생성
        final String DB_USER = "root"; // 유저 root 명
        final String DB_PASS = "5046"; // DB 패스워드

        try {
            Class.forName(driver); // JDBC 드라이버 등록
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS); // 디비 연결
            if (conn != null) {
                System.out.println("DB 접속 성공");
            }
        } catch (ClassNotFoundException e) { // JDBC 드라이버 등록실패시
            System.out.println("드라이버 로드 실패");
            e.printStackTrace();
        } catch (SQLException e) { // DriverManager.getConnection() 실패시
            System.out.println("DB 접속 실패");
            e.printStackTrace();
        }
    }
    public void closeDB() {
            /* 데이터베이스 연결 해제 */
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                    System.out.println("DB 접속 해제");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}

