package chapter01;

public class a_43_Method {
	public static void main(String[] args) {
		int a = 30;
		int b = 10;
		
		int ab = calculator(a,b);
		System.out.println("밑변이 " + a + ", 높이가 " + b + "인 사각형의 넓이는 "+ ab +"입니다.");
			
	}
	
	static int calculator(int a, int b) {
		System.out.println("계산을 시작합니다.");
		int area = a * b; 
		return area;
	}
}
