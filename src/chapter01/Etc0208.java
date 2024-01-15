package chapter01;

public class Etc0208 {

	public static void main(String[] args) {
		byte b = 10;
		int i = (int)b;
		System.out.println("i=" + i);
		System.out.println("b=" + b);
		
		// 작은 타입에서 큰 타입으로는 자동 형변환 가능
		// 큰 타입에서 작은 타입으로는 명시적 형변환 필요
		
		int i2 = 10;
		byte b2 = (byte)i2;
		System.out.println("i2="+i2);
		System.out.println("b2="+b2);
	}
}
