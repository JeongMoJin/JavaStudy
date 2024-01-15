
package chapter01;

import java.util.Scanner;

public class Exam16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 : ");
		int age = scanner.nextInt();
		
		if (age > 19) {
			System.out.println("성인입니다.");
			System.out.println("성인요금이 적용됩니다.");
		} else {
			System.out.println("청소년입니다.");
			System.out.println("청소년요금이 적용됩니다.");
		}
		
		System.out.println("결제를 진행해 주세요.");
		
		scanner.close();
	}
}
