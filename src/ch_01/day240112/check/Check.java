package ch_01.day240112.check;

public class Check {
    static int cv = 5; // 클래스 변수0
    int iv = 4; // 인스턴스 변수
    static void cm() { } // 클래스 메서드
    void im() { } // 인스턴스 메서드
    static void cmImember() { // 클래스 메서드가 인스턴스 멤버에 접근
//        System.out.println(iv);
//        im(); // error
    }
    void imCmember() {
        System.out.println(cv);
        cm();
    }
    static void cmCmemrber() {
        System.out.println(cv);
        cm();
    }
    void imImember() {
        System.out.println(iv);
        im();
    }
}
