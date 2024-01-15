package chapter01;

public class MyFor_12 {
	public static void main(String[] args) {
		for (int a = 1; a<=6; a++) {
			for (int b =1; b<=6; b++) {
				if (a+b ==6) {
					System.out.println("("+a+", "+b+")");
				}
			}
		}
	}
}
