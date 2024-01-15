package ch_01.day240111;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle; // 참조변수 선언
        circle = new Circle(); // 객체 생성

        // 객체의 필드 접근
        circle.radius = 100;
        circle.color = "blue";

        // 객체의 메서드 접근
        double area = circle.getArea();

        System.out.println("원의 면적: " + area);
    }
}
