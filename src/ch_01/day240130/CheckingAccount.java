package ch_01.day240130;

import java.util.ArrayList;

public class CheckingAccount { // 출금계좌

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private double chargeRate;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double chargeRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.chargeRate = chargeRate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getChargeRate() {
        return chargeRate;
    }

    public void setChargeRate(double chargeRate) {
        this.chargeRate = chargeRate;
    }

    @Override
    public String toString() {
        return "계좌번호='" + accountNumber + '\'' +
                ", 계좌 소유주 이름='" + accountHolder + '\'' +
                ", 현재 잔액=" + balance +
                ", 이자율=" + chargeRate;
    }
}


