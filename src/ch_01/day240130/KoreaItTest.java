package ch_01.day240130;

import java.util.ArrayList;
import java.util.Scanner;

import static ch_01.day240130.CheckingAccountArrayList.arrayList;

// 이자율 = 입금 시 이자율 계산해서 추가 입금
// 대출 계좌 = 출금 시 수수료율 계산 해서 추가 출금
// 객체 목록 저장 시, 단 하나의 리스트 저장 사용
// 모든 변수 private, 메서드 getter, setter, toString() 사용할 것만
// 추상 클래스 추상 메서드 없어도 됨.
public class KoreaItTest {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CheckingAccountArrayList checkingAccountArrayList = new CheckingAccountArrayList();
        SavingsAccountArrayList savingsAccountArrayList = new SavingsAccountArrayList();

        boolean run = true;
        while (run) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            switch (selectNo) {
                case 1 -> createAccount();
                case 2 -> viewAccountList();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> viewAccount();
                case 6 -> run = false;
                default -> System.out.println("다시 입력해주세요");
            }
        }
        System.out.println("프로그램 종료");
    }

    public static void createAccount() {

        System.out.println("--------------");
        System.out.println("계좌생성");
        System.out.println("--------------");

        System.out.print("계좌종류:(1:예금계좌, 2:대출계좌): ");
        int account = scanner.nextInt();

        if (account == 1 ) {
            System.out.print("계좌번호: ");
            String accountNumber = scanner.next();

            System.out.print("계좌주: ");
            String accountHolder = scanner.next();

            System.out.print("초기입금액: ");
            double balance = scanner.nextDouble();

            System.out.print("이자율: ");
            double chargeRate = scanner.nextDouble();

            CheckingAccountArrayList.addCheckingAccount(new CheckingAccount(accountNumber, accountHolder, balance, chargeRate));

            System.out.println("결과: 계좌가 생성되었습니다.");
            }
            else if (account == 2) {
            System.out.print("계좌번호: ");
            String accountNumber = scanner.next();

            System.out.print("계좌주: ");
            String accountHolder = scanner.next();

            System.out.print("수수료율: ");
            double interestRate = scanner.nextDouble();

            System.out.print("초기대출액: ");
            double balance = scanner.nextDouble();

            SavingsAccountArrayList.addSavingsAccount(new SavingsAccount(accountNumber, accountHolder, interestRate, balance));

            System.out.println("결과: 계좌가 생성되었습니다.");
        }
            else {
            System.out.println("다시 입력해주세요.");
        }

    }

    public static void viewAccountList() {
        for (CheckingAccount checkingAccount : arrayList) {
            System.out.println(checkingAccount);
        }
        System.out.println();
    }

    public static void deposit() {
        System.out.println("----------------");
        System.out.println("예금");
        System.out.println("----------------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        for (CheckingAccount checkingAccount : arrayList) {
            if(accountNumber.equals(checkingAccount.getAccountNumber())) {
                System.out.println("예금액: ");
                double plusBalance = scanner.nextDouble();
                checkingAccount.setBalance(checkingAccount.getBalance()+plusBalance+(plusBalance*checkingAccount.getChargeRate()));
                System.out.println("예금이 성공되었습니다."+ " 예금액 : " + checkingAccount.getBalance());
            } else {
                System.out.println("계좌번호가 없습니다.");
            }
        }
    }

    public static void withdraw() {
        System.out.println("----------------");
        System.out.println("출금");
        System.out.println("----------------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        for (CheckingAccount checkingAccount : arrayList) {
            if(accountNumber.equals(checkingAccount.getAccountNumber())) {
                System.out.println("출금액: ");
                double minusBalance = scanner.nextDouble();
                checkingAccount.setBalance(checkingAccount.getBalance()-minusBalance-(minusBalance*checkingAccount.getChargeRate()));
                System.out.println("출금이 성공되었습니다." + " 출금액 : " + checkingAccount.getBalance());
            } else {
                System.out.println("계좌번호가 없습니다.");
            }
        }

    }

    public static void viewAccount() {
        System.out.println("----------------");
        System.out.println("조회");
        System.out.println("----------------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        for (CheckingAccount checkingAccount : arrayList) {
            if(accountNumber.equals(checkingAccount.getAccountNumber())) {
                System.out.println(checkingAccount);
            } else {
                System.out.println("계좌번호가 없습니다.");
            }
        }
    }
}