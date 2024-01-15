package chapter01;

public class Exam020 {
	public static void main(String[] args) {
		int book = 25;
		switch (book/15) {
		case 0: 
			System.out.println("조금 더 노력하세요");
		case 1: 
			System.out.println("책 읽는 것을 즐기시는 분이시네요!");
		case 2: 
			System.out.println("책을 사랑하시는 분이시네요!");
		default: 
			System.out.println("당신은 다독왕입니다!");
		}
	}
}




