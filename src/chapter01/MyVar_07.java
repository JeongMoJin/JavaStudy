package chapter01;

public class MyVar_07 {

	public static void main(String[] args) {
		int value = 10+2+8;
		System.out.println("value : "+value); // 20
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : "+ str1); // 128 => "12" + "8" | 숫자인 12까지 문자열로 바뀐 것 
		
		String str2 = 10 +"2" +8;
		System.out.println(str2); // 1028
		
		String str3 = "10" +2 +8;
		System.out.println(str3); // 1028
		
		String str4 = "10" +(2 +8);
		System.out.println(str4); // 1010
		 
		
	}
}
