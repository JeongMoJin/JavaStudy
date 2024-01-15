package ch_01.day240112;

class Cars {
    static int wheel = 4;
    int speed;
}
public class CarsClass {
    public static void main(String[] args) {
        System.out.println(Cars.wheel);
        Cars myCar1 = new Cars();

        System.out.println(Cars.wheel);
        System.out.println(myCar1.speed);

        Cars myCar2 = new Cars();

        System.out.println("<변경 전>");
        System.out.println("myCar1.speed: " + myCar1.speed);
        System.out.println("myCar2.speed: " + myCar2.speed);
        System.out.println("myCar1.wheel: " + myCar1.wheel);
        System.out.println("myCar2.wheel: " + myCar2.wheel);

        myCar2.speed = 100;
        myCar2.wheel = 5;
        System.out.println("<변경 후>");
        System.out.println("myCar1.speed: " + myCar1.speed);
        System.out.println("myCar2.speed: " + myCar2.speed);
        System.out.println("myCar1.wheel: " + myCar1.wheel);
        System.out.println("myCar2.wheel: " + myCar2.wheel);
        // 인스턴스는 클래스 변수를 공유하기 때문에 같은 값이 됨
    }
}
