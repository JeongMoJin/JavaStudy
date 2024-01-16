package ch_01.day240116;

import java.util.Scanner;

public class TestAccount {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Account[] accountArray = new Account[100];
    public static void main(String[] args) {

        accountArray[0] = new Account("123", "Mr.01",10000);
        accountArray[1] = new Account("456", "Mr.02",30000);
        accountArray[2] = new Account("789", "Mr.03",50000);
        boolean run = true;
        while (run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택>>");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            }
            if (selectNo == 2) {
                accountList();
            }
            if (selectNo == 3) {
                deposit();
            }
            if (selectNo == 4) {
                withdraw();
            }
            if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
    public static void createAccount() {
        System.out.println("--------------");
        System.out.println("계좌생성");
        System.out.println("--------------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();

        System.out.print("계좌주: ");
        String owner = scanner.next();

        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();

        Account newAccount = new Account(ano, owner, balance);
        for (int i = 0; i < accountArray.length; i++){
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println(accountArray[i]);
                System.out.println("결과 : 계좌가 생성되었습니다.");
                break;
            }
        }
    }
    public static void accountList() {
        System.out.println("--------------");
        System.out.println("계좌목록");
        System.out.println("--------------");
        for(int i = 0;i < accountArray.length; i++) {
            if(accountArray[i] != null) {
                System.out.print(accountArray[i].getAno());
                System.out.print("   ");
                System.out.print(accountArray[i].getOwner());
                System.out.print("   ");
                System.out.print(accountArray[i].getBalance());
                System.out.println();
            } else {break;}

        }
    }
    public static void deposit() {
        System.out.println("----------------");
        System.out.println("예금");
        System.out.println("----------------");
        System.out.print("계좌번호: ");
        String searchAno = scanner.next();
        System.out.println("예금액: ");
        int plusBalance = scanner.nextInt();
        Account account = findAccount(searchAno);
        account.setBalance(account.getBalance()+plusBalance);
        System.out.println("예금액: " + account.getBalance());
//        for (int i = 0; i<accountArray.length; i++) {
//            if (accountArray[i] != null) {
//                if (searchAno.equals(accountArray[i].getAno())){
//                    accountArray[i].setBalance(accountArray[i].getBalance()+plusBalance);
//                    System.out.println("예금액: " + accountArray[i].getBalance());
//                } else {break;}
//            }
//        }
    }
    public static void withdraw() {
        System.out.println("----------------");
        System.out.println("출금");
        System.out.println("----------------");
        System.out.print("계좌번호: ");
        String searchAno = scanner.next();
        System.out.println("출금액: ");
        int minusBalance = scanner.nextInt();
        Account account = findAccount(searchAno);
        account.setBalance(account.getBalance()-minusBalance);
        System.out.println("남은 예금액: " + account.getBalance());
    }
    private static Account findAccount(String ano) {
        Account account = null;
        for(int i = 0; i <accountArray.length; i++) {
            if(accountArray[i] != null) {
                if(accountArray[i].getAno().equals(ano)){
                    account = accountArray[i];
                    break;
                }
            }
            else {
                break;
            }
        }
        return account;
    }
}
