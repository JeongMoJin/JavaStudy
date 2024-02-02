package ch_01.day240202;

public class DivideMyZeroOK {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // 예외 발생!
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램은 계속 진행됩니다.");
    }
}
