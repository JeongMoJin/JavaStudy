package ch_01.day240124.memberManagement;

import ch_01.day240115.Person;
import ch_01.day240124.studentTest.Student;

public class MemberManagement {
    private Member[] members = new Member[10];
    private int idx = 0;
    static class Member {
        private String memberID;
        private String memberName;
        private int memberAge;
        public Member(String memberID, String memberName, int memberAge) {
            this.memberID = memberID;
            this.memberName = memberName;
            this.memberAge = memberAge;
        }
        public String getMemberID() {
            return memberID;
        }
        public String getMemberName() {
            return memberName;
        }

        public int getMemberAge() {
            return memberAge;
        }
    }
    void addMember (String memberID, String memberName, int memberAge) {
        members[idx++] = new Member(memberID, memberName, memberAge);
    }
    Member findMember(String memberID) {
        Member member = null;
        for (int i = 0; i < idx; i++){
            if (members[i] != null) {
                if (members[i].getMemberID().equals(memberID)) {
                    member = members[i];
                    break;
                }
            } else {
                break;
            }
        }
        return member;
    }
    private void displayAllMembers() {
        for (int i = 0; i < idx; i++) {
            if (members[i] != null){
                System.out.print(members[i].getMemberID());
                System.out.print(" ");
                System.out.print(members[i].getMemberName());
                System.out.print(" ");
                System.out.print(members[i].getMemberAge());
                System.out.print(" ");
                System.out.println();
            } else {
                break;
            }
        }
    }
}







