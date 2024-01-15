package chapter01;

import java.util.Scanner;

public class a_42_Method {
	
	static int getMax(int a, int b, int c) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = scanner.nextInt();
		System.out.print("정수 b : ");
		int b = scanner.nextInt();
		System.out.print("정수 c : ");
		int c = scanner.nextInt();
		
		System.out.println("최대값은 " + getMax(a, b, c) + "입니다.");
		scanner.close();
	}
}
