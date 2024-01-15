package chapter01;

import java.util.Scanner;

public class a_41_Method {
	static Scanner scanner = new Scanner(System.in);
	
	static int getMax(int a, int b, int c) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}
	
	static void inputData(int[] height, int[] weight, int[] age) {
		for (int i = 0; i < 3; i++) {
			System.out.println("[" + (i + 1) + "]");
			System.out.println("신장:"); height[i] = scanner.nextInt();
			System.out.println("   체중:"); weight[i] = scanner.nextInt();
			System.out.println("   나이:"); age[i] = scanner.nextInt();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] height = new int[3];
		int[] weight = new int[3];
		int[] age = new int[3];
		
		inputData(height, weight, age);
		
		
//		// 신장의 최댓값
//		int maxHeight = height[0];
//		if (height[1] > maxHeight) maxHeight = height[1];
//		if (height[2] > maxHeight) maxHeight = height[2];
//		
//		// 체중의 최댓값
//		int maxWeight = weight[0];
//		if (weight[1] > maxWeight) maxWeight = weight[1];
//		if (weight[2] > maxWeight) maxWeight = weight[2];
//		
//		// 체중의 최댓값
//		int maxAge = age[0];
//		if (age[1] > maxAge) maxAge = age[1];
//		if (age[2] > maxAge) maxAge = age[2];
		
		int maxHeight = getMax(height[0], height[1], height[2]);
		int maxWeight = getMax(weight[0], weight[1], weight[2]);
		int maxAge = getMax(age[0], age[1], age[2]);
		
		System.out.println("신장의 최대값은 " + maxHeight + "입니다.");
		System.out.println("체중의 최대값은 " + maxWeight + "입니다.");
		System.out.println("나이의 최대값은 " + maxAge    + "입니다.");
	}
}
