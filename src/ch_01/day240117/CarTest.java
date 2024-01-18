package ch_01.day240117;

class Car2 {
    String maker;
    String model;
    String color;
    int carSpeed;
    public String getMaker() {return maker;}
    public void setMaker(String maker) {this.maker = maker;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public int getCarSpeed() {return carSpeed;}
    public void setCarSpeed(int carSpeed) {this.carSpeed = carSpeed;}
    public Car2(String maker, String model, String color, int carSpeed) {
        this.maker = maker;
        this.model = model;
        this.color = color;
        this.carSpeed = carSpeed;
    }
    void speedUp() {carSpeed++;}
    void speedDown() {carSpeed--;}
}
class SportCar extends Car2 {
    public SportCar(String maker, String model, String color, int carSpeed) {
        super(maker, model, color, carSpeed);
    }

    void speedUp() {
        this.carSpeed = carSpeed + 5;
    }
    void speedDown() {
        this.carSpeed = carSpeed - 5;
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car2 car1 = new Car2("현대", "소나타", "검정", 0);
        Car2 car2 = new Car2("테슬라", "모델1", "파랑", 0);
        SportCar sportCar = new SportCar("아우디", "a6", "회색",0);
        car1.speedUp();
        car1.speedUp();
        car1.speedUp();
        System.out.println(car1.getCarSpeed());
        System.out.println(car1.getModel()); // 소나타
        sportCar.speedUp();
        sportCar.speedUp();
        sportCar.speedUp();
        System.out.println(sportCar.getCarSpeed());
        System.out.println(sportCar.getModel()); // a6
    }
}
