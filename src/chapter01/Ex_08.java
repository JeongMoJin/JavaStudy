package chapter01;

import java.util.Scanner;

public class Ex_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("달러 단위의 금액을 입력해주세요.");
		System.out.print("입력 > ");
		int money = scanner.nextInt();
		
		System.out.println("원화 : "+(money*1289.50));
		
		scanner.close();
	}
}
