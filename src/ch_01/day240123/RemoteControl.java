package ch_01.day240123;

public interface RemoteControl {
    public void turnOn();
    public void turnOff();
    public void volumeUp();
    public void volumeDown();
}

class Television implements RemoteControl {
    boolean on;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV가 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV가 꺼졌습니다.");
    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }
}

interface AdancedRemoteControl extends RemoteControl {
    public void volumeUp();
    public void volumeDown();
}