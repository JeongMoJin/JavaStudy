package ch_01.day240214;

import java.sql.SQLException;

public class My_03_CreateTable {
    public static void main(String[] args) throws SQLException {
        DBcreat myDB = new DBcreat();
        myDB.connectDB();
        myDB.createTableUser();
        myDB.closeDB();
    }
}