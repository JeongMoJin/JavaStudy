package chapter01;

import java.util.Scanner;

public class a_45_Method {
	
	static void putStars(int n) {
		for (int i = 0; i < n; i++ ) {
			System.out.print("*");
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("좌하변이 직각인 직감삼각형를 표시합니다.");
		System.out.print("몇 단 : ");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
	}

}
