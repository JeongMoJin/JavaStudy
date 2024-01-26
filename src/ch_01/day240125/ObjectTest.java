package ch_01.day240125;
// Object 타입으로 변수 지정하면 다양한 타입을 저장할 수 있지만, 형변환 필요할 때가 있다.
// 그래서 제네릭 사용 추천
class ObjectData {
    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
public class ObjectTest {
    public static void main(String[] args) {
        ObjectData stringCommonData = new ObjectData();
        ObjectData integerCommonData = new ObjectData();

        stringCommonData.setData("abc");
        integerCommonData.setData(100);
        System.out.println("stringCommonData : " + stringCommonData.getData());
        System.out.println("integerCommonData : " + integerCommonData.getData());

        String tmp = (String) stringCommonData.getData();
    }
}
