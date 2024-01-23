package ch_01.day240123;

interface Member {
    String getMemberInfo();
}

class RegularMember implements Member {
    private String memberId;
    private String memberName;
    private int membershipYear;

    public RegularMember(String abc, String tom, int i) {

    }

    @Override
    public String getMemberInfo() {
        return null;
    }
}
class VIPMember implements Member {
    private String memberId;
    private String memberName;
    private int membershipYear;

    public VIPMember(String abc, String tom, int i) {

    }

    @Override
    public String getMemberInfo() {
        return null;
    }
}
public class Ex_01 {
    public static void main(String[] args) {
        Member[] members = new Member[2];
        members[0] = new RegularMember("abc", "tom", 5);
        members[1] = new VIPMember("bcd", "jim", 2);

        for (Member member : members) {
            System.out.println(member.getMemberInfo());
        }
    }
}
