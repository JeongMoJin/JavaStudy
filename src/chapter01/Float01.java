package chapter01;

public class Float01 {

	public static void main(String[] args) {

		float f = 1.2344244244234f;
//		float f3 = 1.2f; // 접미사 없어서 에러
		
		// 1, I, l, | 0
		
		double d = 1.232132142142142;
		float f2 = 0.10000001f; // 0.1
		double d2 = 0.1000000001; // double은 접미사 생략가능
		double d3 = 0.10000000000000001;
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(d3);
		
		// ' ' 글자 1자
		// " " 글자 2자 이상
	}

}
