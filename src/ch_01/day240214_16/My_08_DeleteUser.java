package ch_01.day240214_16;

import java.sql.SQLException;

public class My_08_DeleteUser {
    public static void main(String[] args) throws SQLException {
        DBDelete myDB = new DBDelete();
        myDB.connectDB(); // 데이터베이스 연결
        myDB.getAllUser(); // 모든 유저 보여줌
        myDB.deleteUser(); // 삭제 처리
        myDB.getAllUser(); // 모든 유저 보여줌 > 삭제 확인 용도
        myDB.closeDB(); // 데이터베이스 연결 닫기
        
    }
}
