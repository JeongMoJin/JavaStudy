package ch_01.day240202;

public class Ex_01 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        try {
            for (int i = 0; i < 11; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열에 없는 index는 출력이 안됩니다.");
        }
        System.out.println("프로그램은 계속 진행됩니다.");
    }
}
