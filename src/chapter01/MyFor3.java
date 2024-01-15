package chapter01;

public class MyFor3 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i<=100; i= i + 3) {
				sum += i;
		}
		System.out.println("합 : " + sum);
		// 동일 결과 일 때, 반복작업이 더 작은 코드가 더 좋은 코드
	}
}
