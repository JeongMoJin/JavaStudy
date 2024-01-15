package chapter01;

public class a_48_CallByRef {
	public static void increase(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		int[] refArray = {100, 800, 1000};
		
		System.out.println("메서드 호출 전");
		for(int i = 0; i < refArray.length; i++) {
			System.out.println("refArray[" + i + "]: " + refArray[i]);
		}
		
		increase(refArray);
		
		System.out.println();
		System.out.println("메서드 호출 후");
		for(int i = 0; i < refArray.length; i++) {
			System.out.println("refArray[" + i + "]: " + refArray[i]);
		}
	}
}
