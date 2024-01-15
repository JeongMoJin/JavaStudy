package chapter01;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num;
		
		while(true) {
			System.out.println("더할 숫자를 입력하세요:(종료하려면 0입력)");
			num = scanner.nextInt();
			if (num==0) {
				break;
			}
			sum += num;
		}
		System.out.println("현재까지 총합 :"+sum);
        scanner.close();
	}
}
