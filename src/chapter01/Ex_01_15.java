package chapter01;

public class Ex_01_15 {
	public static void main(String[] args) {
		for (double x = 0.1; x <= 1.0; x+=0.1) {
			System.out.println(x);
			// 대안 1. 정수로 변환 후 계산 결과 값을 실수로 변환
			// 대안 2. 자바에서는 정확한 실수 계산을 위해 Decimal 클래스 제공
		}
	}
}
