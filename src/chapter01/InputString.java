package chapter01;

import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		String name;
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		name = scanner.nextLine(); // 문자열 입력
		System.out.print("나이를 입력하시오: ");
		age = scanner.nextInt();
		
		System.out.println(name + "님 안녕하세요! "+age+"살이시네요.");
		scanner.close();
	}
}
