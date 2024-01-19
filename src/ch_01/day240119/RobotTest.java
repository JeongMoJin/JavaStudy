package ch_01.day240119;

class Robot{}

class DanceRobot extends Robot {
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}
class SingRobot extends Robot {
    void sing() {
        System.out.println("노래를 합니다.");
    }
}
class DrawRobot extends Robot {
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}
public class RobotTest {
    public static void action(Robot robot){
        if (robot instanceof DanceRobot) {((DanceRobot) robot).dance();}
        if (robot instanceof SingRobot) {((SingRobot) robot).sing();}
        if (robot instanceof DrawRobot) {((DrawRobot) robot).draw();}
    }

    public static void main(String[] args) {
        Robot[] robots = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for (Robot robot : robots) {
            action(robot);
        }
    }
}


















