package chapter01;

public class a_52_MethodOverLoading {

	public static void main(String[] args) {
		printGreet();
		printGreet("안녕~!");
		printGreet("정모", "잘 지내셨나요?");
		printGreet(3);
	}
	
	public static void printGreet() {
		System.out.println("printGreet() 메서드가 실행됩니다.");
		System.out.println("안녕하세요");
	}
	
	public static void printGreet(String greeting) {
		System.out.println("printGreet(String greeting) 메서드가 실행됩니다.");
		System.out.println(greeting);
	}
	public static void printGreet(String name, String greeting) {
		System.out.println("printGreet(String name, String greeting) 메서드가 실행됩니다.");
		System.out.println(name + "님!" +  greeting);
	}
	public static void printGreet(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println("안녕하세요");
		}
	}

}
