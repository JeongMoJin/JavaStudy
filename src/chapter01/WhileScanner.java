package chapter01;

import java.util.Scanner;

public class WhileScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer = "Y";
		int count = 0;
		
		while (answer.equals("Y") ) {
			System.out.println("음악을 재생하시겠습니까?(Y)");
			answer = scanner.nextLine();
			answer = answer.toUpperCase(); // 입력 문자열을 대문자로 변환해주는 메서드
			
			if (answer.equals("Y")) {
				count++;
				System.out.println("음악을 " + count + "번 재생했습니다.");
			}
		}
		System.out.println("재생종료");
		scanner.close();
	}
}
