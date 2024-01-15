package chapter01;

public class MyVar_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		// String 형변환 시 parse- 함수 사용
		String str = "1a"; // String은 int나 char처럼 기본 자료타입 아니라 클래스의 객체 형태라서 일반과 다른 형변환
		
		String str1 = "10";
		byte value1 = Byte.parseByte(str1);
		System.out.println(value1);
		
		String str2 = "200";
		short value2 = Short.parseShort(str2);
		System.out.println(value2);
		
		String str3 = "3000000";
		int value3 = Integer.parseInt(str3);
		System.out.println(value3);
		
		String str4 = "40000000";
		long value4 = Long.parseLong(str4);
		System.out.println(value4);
		
		String str5 = "12.345";
		float value5 = Float.parseFloat(str5);
		System.out.println(value5);
		
		String str6 = "12.345";
		double value6 = Double.parseDouble(str6);
		System.out.println(value6);
		
		String str7 = "true";
		boolean value7 = Boolean.parseBoolean(str7);
		System.out.println(value7); // true

	}

}
