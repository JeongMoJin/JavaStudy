package chapter01;

public class a_23_Array {
	public static void main(String[] args) {
		// 자바 배열 특징
		// 동일한 자료형만 저장
		// 변수 선언 시 저장할 데이터 개수를 지정
		int score_001 = 95;
		int score_002 = 76;
		int score_003 = 67;
		int score_004 = 56;
		int score_005 = 87;
		
		int total = score_001 + score_002 + score_003 + score_004 + score_005;
		double avg = (double)total/5;
		System.out.println("총점은 " + total + "점이고, 평균은" + avg + "입니다.");
		
		total = 0;
		int[] scores = {95,76,67,56,87};
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		avg = (double)total / scores.length;
		System.out.println("총점은 " + total + "점이고, 평균은 " + avg + "입니다.");
	}
}
