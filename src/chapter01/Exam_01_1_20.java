package chapter01;

import java.util.Scanner;

public class Exam_01_1_20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id, password;
		System.out.print("ID를 입력해주세요 : ");
		id = scanner.nextLine();
		
		if (id.equals("java")) {
			System.out.println("ID가 일치합니다.");
			System.out.print("PASSWORD를 입력해주세요 : ");
			password = scanner.nextLine();
			
			if (password.equals("1234")) {
				System.out.println("PASSWORD가 일치합니다.");
			} else {
				System.out.println("PASSWORD가 일치하지 않습니다.");
			}
		} else {
			System.out.println("ID가 일치하지 않습니다.");
		}
		scanner.close();
	}
}
