package chapter01;

import java.util.Scanner;

public class Ex_01_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		
		if (num < 0 ) {
			System.out.println("음수입니다.");
		} else if (num == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("양수입니다.");
		}
		scanner.close();
	}
}
