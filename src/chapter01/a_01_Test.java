package chapter01;

import java.util.Random;
import java.util.Scanner;

public class a_01_Test {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int randomInt = random.nextInt(999) + 1; // 맞혀야 할 랜덤 정수 생성
		int count = 0; // 시도 횟수 생성
		
		while (true) {
			System.out.print("정답을 추측하여 보시오: ");
			int answer = scanner.nextInt();
			
			if (answer > randomInt) { // 제시 정수가 높을 시
				count++; // 시도 횟수 증가
				System.out.println(); // 가독성을 위한 줄바꿈
				System.out.println("제시한 정수가 높습니다.");
			} else if (answer < randomInt) { // 제시 정수가 낮을 시
				count++;
				System.out.println();
				System.out.println("제시한 정수가 낮습니다.");
			} else if (answer == randomInt) { // 정답을 맞혔을 시 ( else를 쓰는 것이 효율적인 코드다)
				count++;
				break; // 반복문 탈출
			}
		}
		System.out.println();
		System.out.println("정답입니다. 축하합니다. 시도횟수는 " + count +"회 입니다.");
		scanner.close();
	}
}
