package ch_01.day240130;

import java.util.ArrayList;

public class CheckingAccountArrayList {
    public static ArrayList<CheckingAccount> arrayList;

    public CheckingAccountArrayList() {this.arrayList = new ArrayList<>();}

    public static void addCheckingAccount(CheckingAccount checkingAccount) {
        arrayList.add(checkingAccount); // 계좌 추가
    }

}


