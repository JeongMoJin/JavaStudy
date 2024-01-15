package chapter01;

import java.util.Scanner;

public class Ex_01_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 월인가요?? ");
		int month = scanner.nextInt();
		
		if (month == 1 || month == 2 || month == 12) {
			System.out.println("겨울입니다.");
		}
		else if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄입니다.");
		}
		else if (month == 6 || month == 7 || month == 8) {
			System.out.println("여름입니다.");
		}
		else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을입니다.");
		} else {
			System.out.println("잘못된 입력 값입니다.");
		}
		scanner.close();
	}
}
