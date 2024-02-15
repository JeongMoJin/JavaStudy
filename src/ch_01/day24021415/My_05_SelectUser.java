package ch_01.day24021415;

import java.sql.SQLException;

public class My_05_SelectUser {
    public static void main(String[] args) throws SQLException {
        DBSelect myDB = new DBSelect();
        myDB.connectDB();
        myDB.getAllUser();
        myDB.getOneUser();
        myDB.closeDB();
    }
}
