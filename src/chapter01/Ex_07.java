package chapter01;

import java.util.Scanner;

public class Ex_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cm;
		double inch;
		
		System.out.println("cm 단위의 숫자를 입력해주세요 : ");
		System.out.print("입력 > ");
		cm = scanner.nextInt();
		
		inch = cm * 0.393701;
		System.out.println(cm + "cm는 " + inch + " inch 입니다.");
		
		scanner.close();
	}
}
