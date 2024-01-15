package ch_01.day240115;

class Account {
    private int regNumber;
    String name;
    private int balance;

    public Account(int regNumber, String name) {
        this.regNumber = regNumber;
        this.name = name;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getBalance() {return balance;}
    public void setBalance(int balance) {this.balance = balance;}
}
public class AcoountTest {
    public static void main(String[] args) {
        Account account = new Account(1234,"Tom");
        account.setName("Tom");
        account.setBalance(100000);
        System.out.println("이름은 "+ account.getName() + " 통장 잔고는 " + account.getBalance() + "입니다.");
    }
}
