package chapter01;

import java.util.Random;
import java.util.Scanner;
// 메서드 오버로딩 : 매개변수 타입 or 개수가 다르면 같은 이름의 메서드 생성 가능
public class a_51_Method {
	static Scanner scanner = new Scanner(System.in);
	
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.println("정답입니다!!");
			System.out.print("다시 한번? <Yes-1/No-0> : ");
			cont = scanner.nextInt();
		} while(cont != 0 && cont != 1);
		return cont == 1;
	}
	
	
	public static void main(String[] args) {
	Random random = new Random();	
	
	System.out.println("암산 트레이닝!!");
	do {
		int x = random.nextInt(90)+10;
		int y = random.nextInt(90)+10;
		int z = random.nextInt(90)+10;
		
		while(true) {
			System.out.println(x + " + " + y + " + " + z + " = ");
			int k = scanner.nextInt();
			if (k== x + y + z) break;
			else if (k > x + y + z) System.out.println("Down"); 
			else System.out.println("UP"); 
		}
	} while(confirmRetry());
	}
}
