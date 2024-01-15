package chapter01;

import java.util.Scanner;

public class Exam022 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해주세요 >>> ");
		int month = scanner.nextInt();
		int day;
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12: // case가 여러가지인 경우 생략가능 
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			day = 0;
			System.out.println("존재하지 않는 달입니다.");
		}
		System.out.println(month + "월은 " + day + "일 까지 있습니다.");
        scanner.close();
	}
}
