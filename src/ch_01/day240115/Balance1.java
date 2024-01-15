package ch_01.day240115;

public class Balance1 {
    private int balance;
    final int MIN_BALANCE = 0;
    final int MAX_BALANCE = 1000000;
    public Balance1(int balance) {
        this.balance = balance;
    }
    public Balance1() {
    }
    public void setBalance(int balance) {
        this.balance = (balance<MIN_BALANCE || balance>MAX_BALANCE)?this.balance : balance;
    }
    public int getBalance() {return balance;}
}
