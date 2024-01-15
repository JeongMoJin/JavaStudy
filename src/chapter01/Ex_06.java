package chapter01;

import java.util.Scanner;

public class Ex_06 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.println("두 수의 합: "+(x+y));
		System.out.println("두 수의 차: "+(x-y));
		System.out.println("두 수의 곱: "+(x*y));
		System.out.println("두 수의 평균: "+((x+y)/2));
		System.out.println(x > y ? "큰 수: "+x : "작은 수: "+y);
		
		scanner.close();
	}
}
