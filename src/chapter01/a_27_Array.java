package chapter01;

import java.util.Arrays;

public class a_27_Array {
	public static void main(String[] args) {
		int[] c = new int[10];
		for (int i = 0; i < c.length; i++) {
			c[i] = i;
		}
//		
//		System.out.println(c.length);
//		for(int i = 0; i < c.length; i++) {
//			System.out.println(c[i]);
//		}
//		
//		// foreach 문을 이용한 출력
//		System.out.println();
//		for (int d:c) {
//			System.out.print(d);
//		}
//		
		// Arrays.toString 메서드 사용. 문자열로 출력.
		System.out.println();
		System.out.println(Arrays.toString(c));
	}
}
