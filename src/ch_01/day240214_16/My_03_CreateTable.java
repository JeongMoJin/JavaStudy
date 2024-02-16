package ch_01.day240214_16;

import java.sql.SQLException;

public class My_03_CreateTable {
    public static void main(String[] args) throws SQLException {
        DBcreat myDB = new DBcreat();
        myDB.connectDB();
        myDB.createTableUser();
        myDB.closeDB();
    }
}
