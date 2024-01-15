package ch_01.day240112.rocket;

public class Test {
    public static void main(String[] args) {
        Rocket rocket = new Rocket(10,20);
        System.out.println(rocket.printInfo());
        rocket.moveUp();
        rocket.moveUp();
        System.out.println(rocket.printInfo());
    }
}
