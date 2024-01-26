package ch_01.day240125.member;

import java.util.LinkedList;

public class MemberLinkedListTest {
    public static void main(String[] args){
        MemberLinkedList memberLinkedList = new MemberLinkedList();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서원");
        Member memberHong = new Member(1004, "홍길동");

        memberLinkedList.addMember(memberLee);
        memberLinkedList.addMember(memberSon);
        memberLinkedList.addMember(memberPark);
        memberLinkedList.addMember(memberHong);

        memberLinkedList.showAllMember();

        memberLinkedList.removeMember(1004);
        memberLinkedList.showAllMember();
    }
}
