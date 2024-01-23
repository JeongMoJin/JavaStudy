package ch_01.day240123;

interface MyInterface {
    // 모두 public static final이 자동으로 붙음
    int w = 10;
    static int x = 20;
    final int y = 30;
    public static final int z = 40;
}

public class MyInterface_01 {
    public static void main(String[] args) {
        System.out.println("w = " + MyInterface.w);
        System.out.println("x = " + MyInterface.x);
        System.out.println("y = " + MyInterface.y);
        System.out.println("z = " + MyInterface.z);
    }
}
