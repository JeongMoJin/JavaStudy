package ch_01.day240115;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

        System.out.println("c1의 color=" + car1.color + ", gearType=" + car1.gearType+", door = " + car1.door);

        Car car2 = new Car("blue");

        System.out.println("c2의 color=" + car2.color + ", gearType=" + car2.gearType+", door = " + car2.door);

    }
}
