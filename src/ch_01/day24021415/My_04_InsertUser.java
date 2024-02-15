package ch_01.day24021415;

import java.sql.SQLException;

public class My_04_InsertUser {
    public static void main(String[] args) throws SQLException {
        DBInsert myDB = new DBInsert();
        myDB.connectDB();
        myDB.insertUser();
        myDB.closeDB();
    }
}
