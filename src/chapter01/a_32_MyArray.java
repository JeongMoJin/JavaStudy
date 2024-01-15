package chapter01;

public class a_32_MyArray {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 5;
		
		if (num1 == num2) {
			System.out.println("두개의 값이 같습니다.");
		}
		else {
			System.out.println("두개의 값이 다릅니다.");
		}
		
		int[] nums1 = new int[] {1,2,3};
		int[] nums2 = new int[] {1,2,3};
		if (nums1 == nums2) {
			System.out.println("두개의 참조가 같습니다.");
		}
		else {
			System.out.println("두개의 참조가 다릅니다.");
		}
		System.out.println(nums1);
		System.out.println(nums2);
	}
}
