package chapter01;

public class DoWhile {
	public static void main(String[] args) {
		int num = 100;
		do {
			System.out.println("적어도 한 번은 출력되는 문장");
		} while(num < 10); // 조건이 false 라도 한 번은 출력된다.
 	}
}
