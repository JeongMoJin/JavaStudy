package ch_01.day240125.member;

import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        this.arrayList = new ArrayList<>();
    }
    public void addMember(Member member) {
        arrayList.add(member); // 회원을 추가
    }
    public boolean removeMember(int memberID) {
        for (Member member : arrayList) {
            if(member.getMemberId() == memberID) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}

