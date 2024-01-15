package chapter01;

public class ForToWhile {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		
		for (num=1; num <= 10; num++) {
			sum += num;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		num = 1;
		sum = 0;
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " +sum+"입니다.");
	}
}
