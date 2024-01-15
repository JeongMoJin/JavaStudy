package chapter01;

import java.util.Scanner;

public class a_46_Method {
	
	static void putStars(int n) {
		for (int i = n-1; i > 0 ; i-- ) {
			System.out.print("*");
			for (int j = n-i; j < n; j++) {
				System.out.print(" ");
			}
		} // 공백 + * n = 5 ///////// n-1 > n-2 > n-3 > n-n // 
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("우하변이 직각인 직감삼각형를 표시합니다.");
		System.out.print("몇 단 : ");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
	}

}
