package chapter01;

public class MyFor {
	public static void main(String[] args) {
		int sum = 0;
		int num;
		
		for(num = 0; sum < 100; num++) {
			sum += num;
			System.out.println("num : " + num + " / sum : " + sum);
		}
		
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}
}
