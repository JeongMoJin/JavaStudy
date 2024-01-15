package chapter01;

public class a_24_Exan {
	public static void main(String[] args) {
		int[] student; // 힙공간의 배열의 주소가 저장될 변수 생성
		student = new int[3]; // 힙공간의 길이가 3인 배열 생성(연속된 주소를 가짐)하고 주소를 반환.
		//int[] student = new int[3];
		// 정수 배열이 생성이 되고, 초기화를 하지 않으면 자동으로 0으로 초기화
		System.out.println("현재 자동으로 초기화된 값: " + student[0]);
		
		// 인덱스를 이용하여서 개별 요소의 값을 변경
		student[0] = 30;
		student[1] = 20;
		student[2] = 10;
		
		System.out.println("현재 첫 번째 요소의 값: " + student[0]);
	}
}
