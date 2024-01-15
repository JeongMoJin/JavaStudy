package chapter01;

public class MyBreak {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; ; i++) {
			if(i > 10) {
				break;
			}
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
}
