package ch_01.day240125;
// 제네릭 (Generic) : 일반화, 범용화 라는 의미
// 클래스나 메서드에서 사용하는 필드나 매개변수의 자료형(클래스형)을 호출하는 쪽에서 지정하도록 하는 기능
// 일반적으로는 클래스에서 미리 데이터 타입 지정하지만, 제네릭은 호출하는 쪽에서 타입 지정
class CommonData<T>{
    private T data; // 데이터 타입을 T로 지정, Type의 약자. 클래스 선언에서 <> 사이에 다른 문자를 넣어도 됨
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
public class Generic {
    public static void main(String[] args) {
        CommonData<String> stringCommonData = new CommonData<String>();
        // 호출하는 쪽에서 타입을 지정
        CommonData<Integer> integerCommonData = new CommonData<>();
        // 선언하면서 타입을 지정하면 생성자에서는 타입을 생략 가능

        stringCommonData.setData("abc");
        integerCommonData.setData(100);

        System.out.println("stringCommonData : " + stringCommonData.getData());
        System.out.println("integerCommonData : " + integerCommonData.getData());
    }
}


