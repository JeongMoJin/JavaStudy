package chapter01;

import java.util.Scanner;

public class MyFor5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("임의의 양수를 입력하세요 : ");
		int num = scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i<=num; i++) {
			sum += i;
		}
		System.out.println("1부터 "+num+"사이의 모든 정수의 합계는 "+sum+"입니다.");
		scanner.close();
	}
}
