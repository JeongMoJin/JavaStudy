package ch_01.day240216_19.patternb;

public class Account {
    private int accID;
    private int balance;
    private String cusName;

    // 모든 필드를 사용하는 생성자가 필요
    public Account(int accID, int balance, String cusName) {
        this.accID = accID;
        this.balance = balance;
        this.cusName = cusName;
    }

    @Override
    public String toString() {
        return "Acount{" +
                "accID=" + accID +
                ", balance=" + balance +
                ", cusName='" + cusName + '\'' +
                '}';
    }

    public static class Builder {
        // 외부 클래스와 동일한 필드를 가짐
        private int accID;
        private int balance;
        private String cusName;

        Builder() {

        }

        public Builder accID(int accID) {
            this.accID = accID;
            return this;
        }

        public Builder balance(int balance) {
            this.balance = balance;
            return this;
        }

        public Builder cusName(String cusName) {
            this.cusName = cusName;
            return this;
        }

        public Account Builder() {
            return new Account(this.accID, this.balance, this.cusName);
        }

    }
}


























