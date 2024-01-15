package chapter01;

public class a_50_Method {

	public static void main(String[] args) {
		int a = 1;
		int b = a;
		b++;
		
		System.out.println("a: " + a + ", b: " + b); // a: 1, b: 2
		
		int[] nums_01 = new int[1];
		nums_01[0] = 1;
		
		int[] nums_02 = nums_01;
		nums_02[0] = 2;
		
		System.out.println("nums_01[0]: " + nums_01[0] + ", nums_02[0]:" + nums_02[0]);
	}

}
