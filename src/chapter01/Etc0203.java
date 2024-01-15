package chapter01;

public class Etc0203 {
	public static void main(String[] args) {
		
		// 자동 형변환 : 작은 범위에서 큰 범위로 변경 시 적용
		// 작은 범위에서 큰 범위로 변경되는 경우 값 손실 없음 (ex. int -> float o | float -> int x)
		
		byte a = 127;
		int b = a;
		System.out.println(b);
		
		float c = b;
		System.out.println(c);
	}
}
