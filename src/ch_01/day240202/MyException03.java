package ch_01.day240202;

public class MyException03 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        
        try {
            System.out.println("arr[2]=" + arr[2]);
            System.out.println("arr[3]=" + arr[3]);
            System.out.println("arr 출력 완료");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 발생 : catch 문 수행");
        }
        System.out.println("try/catch 구문 밖 문장 수행");
    }
}
