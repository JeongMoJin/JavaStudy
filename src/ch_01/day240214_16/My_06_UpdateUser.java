package ch_01.day240214_16;

import java.sql.SQLException;

public class My_06_UpdateUser {
    public static void main(String[] args) throws SQLException {
        DBUpdate myDB = new DBUpdate();
        myDB.connectDB(); // DB 클래스에 선언된 메서드
        myDB.getAllUser(); // DBSelect 클래스에 선언된 메서드
        myDB.updateUser();
        myDB.getAllUser(); // DBSelect 클래스에 선언된 메서드
        myDB.closeDB(); // DB 클래스에 선언된 메서드
    }
}
