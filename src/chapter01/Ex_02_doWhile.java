package chapter01;

import java.util.Random;

public class Ex_02_doWhile {
	public static void main(String[] args) {
		Random random = new Random();
		int num1;
		int num2;
		
		do {
			num1 = random.nextInt(6) + 1;
			num2 = random.nextInt(6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
		} while (num1 + num2 != 5);
	}
}
