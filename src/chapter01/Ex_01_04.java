package chapter01;

import java.util.Scanner;

public class Ex_01_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		int score = scanner.nextInt();
		
		switch (score/10) {
		case 9, 10 -> System.out.println("A");
		case 8 -> System.out.println("B");
		case 7 -> System.out.println("C");
		case 6 -> System.out.println("D");
		case 0, 1, 2, 3, 4, 5 -> System.out.println("F");
		default -> System.out.println("잘못된 점수를 입력하였습니다.");
		}
		scanner.close();
	}
}
