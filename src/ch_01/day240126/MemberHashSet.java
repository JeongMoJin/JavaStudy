package ch_01.day240126;

import ch_01.day240125.member.Member;

import java.util.HashSet;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>(); // HashSet 생성.
    }
    public void addMember(Member member) {
        hashSet.add(member); // HashSet에 회원 추가
    }

    public boolean removeMember(int memberId) {
        for (Member member : hashSet) {
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }
    public void showAllMember() {
        for (Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
