package chapter01;

public class MethodEx1 {
	public void print() {
		System.out.println("메서드를 호출한다");
	}
	
	public static void main(String[] args) {
		MethodEx1 method = new MethodEx1();
		method.print();
		method.print();
		method.print();
	}
}
