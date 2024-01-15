package chapter01;

import java.util.Scanner;

public class Exam019 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 >>>");
		int age = scanner.nextInt();
		
		if(age <= 8 && age >= 0) {
			System.out.println("유아입니다.");
			System.out.println("유아요금이 적용됩니다.");
		}
		else if (age <= 13 && age > 9) {
			System.out.println("어린이입니다.");
			System.out.println("어린이요금이 적용됩니다.");
		}
		else if (age <= 19 && age > 14) {
			System.out.println("청소년입니다.");
			System.out.println("청소년요금이 적용됩니다.");
		}
		else {
			System.out.println("성인입니다.");
			System.out.println("성인요금이 적용됩니다.");
		}
		System.out.println("결제를 진행해 주세요.");
        scanner.close();
	}
}
