package ch_01.day240216.patternb;


public class Test {
    public static void main(String[] args) {
        // 계좌번호를 초기값으로 객체 생성
        Account account1 = new Account.Builder().accID(222).Builder();
        System.out.println(account1);

        // 계좌번호, 잔액을 초기값으로 객체 생성
        Account account2 = new Account.Builder().accID(222).balance(10000).Builder();
        System.out.println(account2);

        // 계좌번호, 잔액, 예금주를 초기값으로 객체 생성
        Account account3 = new Account.Builder().accID(222).balance(10000).cusName("홍길동").Builder();
        System.out.println(account3);

        // 잔액, 예금주를 초기값으로 객체 생성
        Account account4 = new Account.Builder().balance(10000).cusName("홍길동").Builder();
        System.out.println(account4);
        
        // 예금주를 초기값으로 객체 생성
        Account account5 = new Account.Builder().cusName("홍길동").Builder();
        System.out.println(account5);
    }
}
