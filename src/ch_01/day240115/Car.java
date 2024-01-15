package ch_01.day240115;

public class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this.color = "white";
        this.gearType = "auto";
        this.door = 4;
    }

    Car (String color){
        this(color, "auto",4);
    }
    Car (String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
