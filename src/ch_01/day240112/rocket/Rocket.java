package ch_01.day240112.rocket;

public class Rocket {
    int x;
    int y;
    public Rocket(int x, int y) {
        this.x = x;
        this.y = y;
    }
    String printInfo() {
        return ("x: "+x+", "+"y: "+y);
    }
    void moveUp() {
        ++y;
    }
}
