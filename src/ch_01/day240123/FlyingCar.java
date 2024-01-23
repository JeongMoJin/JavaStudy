package ch_01.day240123;

interface Flyable {
    void fly();
}
class Car {
    int speed;
    void setSpeed(int speed) {
        this.speed = speed;
    }
        }
public class FlyingCar extends Car implements Flyable {
    public void fly() {
        System.out.println("I'm flying!");
    }

    public static void main(String[] args) {
        FlyingCar flyingCar = new FlyingCar();
        flyingCar.setSpeed(300);
        flyingCar.fly();
    }
}
