package chapter01;

public class Exam021 {
	public static void main(String[] args) {
		String medal = "Silver";
		
		if (medal.equals("Gold")) {
			System.out.println("금메달 입니다.");
		} else if (medal.equals("Silver")) {
			System.out.println("은메달 입니다.");
		} else if (medal.equals("Bronze")) {
			System.out.println("동메달 입니다.");
		} else {
			System.out.println("메달이 없습니다.");
		}
	}
}
