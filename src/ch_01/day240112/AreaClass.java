package ch_01.day240112;

public class AreaClass {
    public static void main(String[] args) {
        /*
        클래스 메서드는 객체를 생성하지 않아도 호출이 가능
        인스턴스 메서드는 객체를 생성해야만 호출이 가능
        왜냐하면 인스턴스 메서드는 객체가 생성되어야 메모리상(힙 영역)에 실제로 존재하고
        클래스 메서드는 클래스가 메모리에 올라갈 때 생성(데이터 영역)되기 떄문
         */
        Area.manual();

        Area cal = new Area();
        cal.manual();
        System.out.println(cal.triangle(3,5));
        System.out.println(cal.triangle(3,4));
    }
}
