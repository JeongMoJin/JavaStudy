package ch_01.day240115;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("박승준", "010-1234-5678", "053-123-4567", "test@naver.com");
        System.out.println(person);
        person.setEmail("test@kakao.com");
        person.setMobile("010-5678-1234");
        System.out.println(person);
    }
}
