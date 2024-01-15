package chapter01;

import java.util.Arrays;
import java.util.Scanner;

public class a_54_MethodArray {
	static boolean run = true; // 반복문의 조건으로 사용 -> 값이 false가 된다면 반복문이 종료
	static int studentNum = 0; // 학생수
	static int[] scores = null; // 점수를 입력 받을 빈 배열 생성. 사용자에게 입력받은 학생수를 기준으로 배열 생성.
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

        while (run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();
            if (selectNo == 1) {
                scores = inputStudentNum();// 작성 위치. 학생수를 입력 받아서 배열 생성 
            } else if (selectNo == 2) {
                inputScores(scores);// 작성 위치. 생성된 배열의 갯수 만큼 점수 입력
            } else if (selectNo == 3) {
                printScroes(scores);// 작성 위치. 입력받은 배열의 값을 출력
            } else if (selectNo == 4) {
                printAnalysis(scores);// 작성 위치. 최고 점수, 평균 점수 출력      	
            } else if (selectNo == 5) {
                run = setRun();// 작성 위치. run 값 변경
            }
        }
        System.out.println("프로그램 종료");
	}
	public static int[] inputStudentNum() {
		System.out.print("학생 수를 입력하세요 : ");
		studentNum = scanner.nextInt();
		scores = new int[studentNum]; 
		return scores;
	}
	public static void inputScores(int[] scores) {
		for (int i = 0; i < studentNum; i++) {
			System.out.print("점수를 입력하세요 : ");
			int score = scanner.nextInt();
			scores[i] = score;
		}	
	}
	public static void printScroes(int[] scores) {
		System.out.println(Arrays.toString(scores));
//		for (int i = 0; i < studentNum; i++) {
//			System.out.println("| "+scores[i]+" |" );
//		}
	}
	public static void printAnalysis(int[] scores) {
		int max = scores[0];
		int sum = 0;
		for (int i = 0; i < studentNum; i++) {
			if (max < scores[i]) max = scores[i];
		}
		for (int i = 0; i < studentNum; i++){
			sum += scores[i];
		}
		System.out.println("최대 값 : " + max);
		System.out.println("평균 값 : " + Math.round((float)sum/scores.length*100)/100.0);
	}
	public static boolean setRun() {
		return false;
	}

}
