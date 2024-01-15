package chapter01;

public class Ex_02_for_07 {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j<=6; j++) {
				for(int k = 1; k <= 6; k++) {
					if (i+j+k == 6) {
						System.out.println("(" + i + ", " + j + ", " + k + ")");
					}
				}
			}
		}
	}
}
