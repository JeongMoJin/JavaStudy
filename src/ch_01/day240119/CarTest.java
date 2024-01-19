package ch_01.day240119;

class Car {
    String color;
    int door;
    void drive() {
        System.out.println("drive, Brrrrr~~~~");
    }
    void stop() {
        System.out.println("stop!!!!");
    }
}
class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}
public class CarTest {
    public static void main(String[] args) {
        FireEngine fireEngine = new FireEngine();
        fireEngine.drive();
        fireEngine.water();

        Car car = fireEngine;
        car.drive();

        FireEngine fireEngine2 = (FireEngine)car;
        fireEngine2.drive();
        fireEngine2.water();
    }
}
