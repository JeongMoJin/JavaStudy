package chapter01;

import java.util.Random;

public class Ex_02_while_01 {
	public static void main(String[] args) {
		Random random = new Random();
		
		while(true) {
			int num1 = random.nextInt(6) + 1;
			int num2 = random.nextInt(6) + 1;
			if (num1 + num2 == 5) {
				break;
			} else {
				System.out.println("(" +num1 + ", " + num2 + ")");
			}
		}
	}
}
