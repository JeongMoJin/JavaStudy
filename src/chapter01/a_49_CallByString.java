package chapter01;

public class a_49_CallByString {
	/* 값에 의한 호출이기 때문에 값을 변경할려면 변경된 문자열을 리턴하고
	 * 호출한 쪽에서 값을 저장하면 됨
	 */
	
	public static void setAddress(String addr) {
		addr = "경기도 수원시 장안구";
	}

	public static void main(String[] args) {
		String address = "서울시 강남구 논현동";
		
		System.out.println("메서드 호출 전");
		System.out.println("address: " + address);
		
		setAddress(address);
		
		System.out.println("메서드 호출 후");
		System.out.println("address: " + address);
	}

}
