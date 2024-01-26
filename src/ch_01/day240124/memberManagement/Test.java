package ch_01.day240124.memberManagement;
/*
1. MemberManagement 클래스를 작성하세요.
이 클래스는 다음과 같은 속성을 가져야 합니다.

members : 회원 객체를 저장하는 배열

2. MemberManagement 클래스 내에 내부 클래스 Member를 작성하세요.
Member 클래스는 다음과 같은 속성을 가져야 합니다.

memberID (문자열): 회원의 아이디
memberName (문자열): 회원의 이름
memberAge (정수): 회원의 나이

3. MemberManagement 클래스 내에서 다음 메서드를 작성하세요.

addMember(String memberID, String memberName, int memberAge): 새 회원을 추가하는 메서드로, Member 객체를 생성하여 members 리스트에 추가합니다.
findMember(String memberID): 주어진 아이디에 해당하는 회원을 찾아서 반환하는 메서드입니다.
displayAllMembers(): 모든 회원 정보를 출력하는 메서드입니다.

4. Main 클래스에서 다음과 같은 작업을 수행하세요.

MemberManagement 객체를 생성하세요.
다수의 회원을 추가하고, 몇몇 회원을 검색하고 삭제한 뒤, 모든 회원 정보를 출력하세요.
이 문제를 해결하기 위해 MemberManagement 클래스 내에 내부 클래스 Member를 작성하고,
각종 메서드를 구현하여 회원 관리를 수행하세요. 그리고 Main 클래스에서 객체를 생성하고 작업을 수행하세요.
 */
public class Test {
    public static void main(String[] args) {
        MemberManagement memberManagement = new MemberManagement();
        memberManagement.addMember("123","tom",20);
        memberManagement.addMember("234","jim",21);
        memberManagement.addMember("345","gin",22);

        MemberManagement.Member member = memberManagement.findMember("234");
        System.out.println("회원의 아이디: " + member.getMemberID() + " / 회원의 이름 : " + member.getMemberName() +
                " / 회원의 나이 : " + member.getMemberAge());
    }
}
