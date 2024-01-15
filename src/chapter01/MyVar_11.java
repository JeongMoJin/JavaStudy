package chapter01;

public class MyVar_11 {

	public static void main(String[] args) {
		byte kor, math, eng;
		kor =55;
		math = 99;
		eng = 87;
		
		int sum = kor + math + eng;
		System.out.println("총점 : "+sum);
		
		int avg_01 = sum/3;
		System.out.println("평균 : "+avg_01);

		double avg_02 = sum/3;
		System.out.println("평균 : "+avg_02); // 정수 연산으로 정수 값 나온 후 실수에 저장.

		double avg_03 = (double)sum/3;
		System.out.println("평균 : "+avg_03); // 정수 연산으로 정수 값 나온 후 실수에 저장.
		
		// 연산 시에 큰 타입에 타입을 따라감
		// 숫자 + 문자열 시 숫자 타입 > 문자열로 타입 변환됨
	}
}
