package chapter01;

import java.util.Scanner;

public class Exam023 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해 주세여 >>>");
		int month = scanner.nextInt();
		int day;
		
		switch (month) {
		
		case 1, 3, 5, 7, 8, 10, 12 -> day = 31;
		case 4, 6, 9, 11 -> day = 30;
		case 2 -> day = 28;
		default -> {
			day = 0;
			System.out.println("존재하지 않는 달입니다.");
			}
		}
		System.out.println(month + "월은 " +day+ "일 까지 있습니다.");
		scanner.close();
	}
}
