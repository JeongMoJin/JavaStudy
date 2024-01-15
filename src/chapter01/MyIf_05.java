package chapter01;

public class MyIf_05 {
	public static void main(String[] args) {
		/* 조건문을 잘못만들면 잘못된 결과가 나온다.
		* 0 ~ 100까지 입력이 됨
		* 미 취학 아동 : 0 ~ 7
		* 초등학생 : 8 ~ 13
		* 중, 고등학생 : 14 ~ 19
		* 일반인 : 20 ~ 
		*  */
		int age = 7;
		int charge;
		
		if(age < 8){
			charge = 1000; 
			System.out.println("미 취학 아동입니다.");
		}
		else if(age < 14){
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		else if(age < 20){
			charge = 2500;
			System.out.println("중, 고등학생 입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		} 
		
		System.out.println("입장료는 " + charge + "원입니다.");
	}
}
