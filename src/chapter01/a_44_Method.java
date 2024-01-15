package chapter01;

public class a_44_Method {
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		int result = 0;
		
		a_44_Method method = new a_44_Method();
		result = method.add(num1, num2);
		System.out.println("두수의 합은 " + result);
		System.out.println("두수의 합은 " + method.add(num1, num2));
	}
}
