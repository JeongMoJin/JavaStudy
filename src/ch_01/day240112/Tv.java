package ch_01.day240112;

public class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
    public boolean getPower() {
        return power;
    }
    public void setPower(boolean power) {
        this.power = power;
    }
}
