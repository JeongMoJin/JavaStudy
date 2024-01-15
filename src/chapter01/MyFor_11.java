package chapter01;

public class MyFor_11 {
	public static void main(String[] args) {
		for (int dan =2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			for(int times = 1; times<=9; times++) {
				System.out.println(dan + " X " + times + " = " + (dan * times));
			}
			System.out.println(" ");
		}
	}
}
