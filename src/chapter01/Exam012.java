package chapter01;

import java.util.Scanner;

public class Exam012 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = scanner.nextInt();
		
		System.out.println(age > 19 ? "성인입니다" : "청소년입니다");
		
		scanner.close();
	}
}
