package chapter01;

public class a_53_Method {

	public static void main(String[] args) {
		int a,b,c;
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a + ", " + b + ", " + c + " 중에 제일 큰수는 " + getMax(a, b, c) + "입니다.");
		System.out.println(a + ", " + b + " 중에 제일 큰수는 " + getMax(a,b) + "입니다.");
	}
	
	public static int getMax(int a, int b, int c) {
		if (a < b) a = b;
		if (a < c) a = c; 
		return a;
	}
	
	public static int getMax(int a, int b) {
		if (a < b) a = b;
		return a;
	}

}
