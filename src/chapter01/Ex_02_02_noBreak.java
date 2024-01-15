package chapter01;

import java.util.Random;
import java.util.Scanner;

public class Ex_02_02_noBreak {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int Q = random.nextInt(6) + 1;
		int A;
		do {
			System.out.print("주사위 값은 얼마일까요? >>>");
			A = scanner.nextInt();
			if (Q == A) {
				System.out.println(A+"! 정답입니다.");
			} else {
				System.out.println("오답입니다. 다시 시도하세요");
			}
		} while(Q!=A);
		
		scanner.close();
	}
}
