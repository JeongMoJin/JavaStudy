package ch_01.day240130;

import java.util.ArrayList;

public class SavingsAccountArrayList {
    public static ArrayList<SavingsAccount> arrayList;
    
    public SavingsAccountArrayList() {this.arrayList = new ArrayList<>();}
    public static void addSavingsAccount(SavingsAccount savingsAccount) {
        arrayList.add(savingsAccount); // 계좌추가
    }
}
