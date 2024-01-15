package chapter01;

import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] arge) {
		Scanner scanner = new Scanner(System.in);
		int x,y,sum;
		
		System.out.print("첫 번째 숫자를 입력하세요: \n"); // 줄바꿈 x
		x = scanner.nextInt(); // 정수 입력
		
		System.out.print("두 번째 숫자를 입력하시오: ");
		y = scanner.nextInt();
		
		sum = x + y;
		System.out.println(sum); // 합 출력
		
		scanner.close();
	}
}
