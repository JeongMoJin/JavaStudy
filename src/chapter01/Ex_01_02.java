package chapter01;

import java.util.Scanner;

public class Ex_01_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		int num = scanner.nextInt();
		
		if (90<=num && num<=100) {
			System.out.println("A");
		} else if (80<=num && num<90) {
			System.out.println("B");
		} else if (70<=num && num<80) {
			System.out.println("C");
		} else if (60<=num && num<70) {
			System.out.println("D");
		} else if (0<=num && num<60) {
			System.out.println("F");
		}
		scanner.close();
		
	}
}
