package ch_01.day240202;

public class MyException02 {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 0;

        try {
            System.out.println("** 정숫값을 0으로 나누는 연산 **");
            System.out.println("10 / 0 = " + (num/num2));
            System.out.println("** 정숫값을 0으로 나누는 연산 완료");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램을 정상 수행합니다.");
    }
}
