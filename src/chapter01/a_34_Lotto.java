package chapter01;

import java.util.Random;

public class a_34_Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		int[] number = new int[45];
		
		for(int i = 0; i < number.length; i++) {
			number[i] = i+1;
			System.out.print(number[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int n = (int)(Math.random() * 45);
			
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(number[i] + " "); // 배열의 내용을 출력한다
		}
	}
}
