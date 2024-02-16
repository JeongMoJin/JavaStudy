package ch_01.day240214_16;

public class My_02_ConnectDB {
    // Connection 객체를 생성해 DataBase 연결하기

    public static void main(String[] args) {
        DB myDB = new DB();
        myDB.connectDB();
        myDB.closeDB();
    }
}