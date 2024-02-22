package ch_01.day240216_19.mvc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;


// Controller
public class AccountManager {


    private final Scanner stdIn;
    private final AccountDAO accountDAO;
    private Connection connection = null;



    public AccountManager() {
        accountDAO = new AccountDAO();
        stdIn = new Scanner(System.in);

    }

    // 디비 관련 시작
    public void makeAccount() { // 계좌 개설
        Account account = new Account();

        System.out.print("계좌 번호: ");
        account.setId(stdIn.nextInt());

        System.out.print("이름: ");
        account.setName(stdIn.next());

        System.out.print("입금액: ");
        account.setBalance(stdIn.nextLong());

        if(this.addAccount(account)) {
            System.out.println("계좌가 개설되었습니다.");
        } else {
            System.out.println("계좌 생성에 실패했습니다.");
        }
    }

    private boolean isAccount(int id) { // 동일한 계좌가 있는지
        return accountDAO.selectAccountCnt(id) == 1;
    }

    private boolean addAccount(Account account) {
        if (this.isAccount(account.getId())) {
            System.out.println(account.getId());
            return false;
        }
        return accountDAO.insertAccount(account);
    }


    public void deposit() { // 입금


        System.out.print("계좌번호: ");
        int id = stdIn.nextInt();

        System.out.print("입금액: ");
        long money = stdIn.nextLong();

        // 해당 계좌 찾기
        if (this.isAccount((id))) {
            accountDAO.updateBalance(id, money, true);
        } else {
            System.out.println("해당 계좌번호가 존재하지 않습니다.");
        }
    }

    public void withdraw() { // 출금
        System.out.print("계좌번호: ");
        int id = stdIn.nextInt();

        System.out.print("출금액: ");
        long money = stdIn.nextLong();

        if(!isAccount(id)) {
            System.out.println("해당 계좌번호가 존재하지 않습니다.");
            return;
        }
        Account account = accountDAO.selectOne(id);
        if (account.getBalance() < money) {
            System.out.println("잔액이 부족합니다.");
        } else {
            accountDAO.updateBalance(id, money, false);
            System.out.println("출금완료 되었습니다.");
        }
    }

    public void inquire() { // 잔액 조회
        System.out.print("계좌번호: ");
        int id = stdIn.nextInt();

        if (!isAccount(id)) {
            System.out.println("해당 계좌번호가 존재하지 않습니다.");
            return;
        }

        Account account = accountDAO.selectOne(id);
        System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
    }

    public void display() {
        /* 전체 계좌 출력 */
        ArrayList<Account> list = accountDAO.selectAll();
        for (Account account : list) {
            System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
        }
    }

    public void disConnect() {
        accountDAO.disConnect();
        stdIn.close();
    }
}

