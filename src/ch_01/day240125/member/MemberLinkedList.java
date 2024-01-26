package ch_01.day240125.member;

import java.util.ArrayList;
import java.util.LinkedList;


public class MemberLinkedList {
    private final LinkedList<Member> LinkedList;

    public MemberLinkedList() {
        LinkedList = new LinkedList<>();
    }
    public void addMember(Member member) {
        LinkedList.add(member); // 회원을 추가
    }
    public boolean removeMember(int memberID) {
        for (int i = 0; i < LinkedList.size(); i++) {
            Member member = LinkedList.get(i);
            if(member.getMemberId() == memberID) {
                LinkedList.remove(i);
                return true;
            }
        }
        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : LinkedList) {
            System.out.println(member);
        }
        System.out.println();
    }
}