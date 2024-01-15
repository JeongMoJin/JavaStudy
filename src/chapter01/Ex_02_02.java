package chapter01;

import java.util.Random;
import java.util.Scanner;

public class Ex_02_02 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int Q = random.nextInt(6) + 1;
		
		while(true) {
			System.out.print("주사위 값은 얼마일까요? >>>");
			int A = scanner.nextInt();
			
			if (Q == A) {
				System.out.println(A+"! 정답입니다.");
				break;
			} else {
				System.out.println("오답입니다. 다시 시도하세요");
			}
			scanner.close();
		}
	}
}
