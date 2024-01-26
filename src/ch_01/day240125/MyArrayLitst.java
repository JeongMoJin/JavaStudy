package ch_01.day240125;

import java.util.ArrayList;
// ArrayList : 배열에서 발전된 형태
// 요소를 추가하면 0번 인덱스부터 차례대로 저장
// 메서드를 사용해서 원하는 위치에 요소를 추가하거나, 삭제, 변환 할 수 있음
public class MyArrayLitst {
    public static void main(String[] args) {
        // 제네릭으로 타입을 지정하지 않은 형태 (Object 형식으로 저장하기 때문에 모든 타입 저장 가능)
        // 초기 capa값을 지정 가능. 지정갯수에 접근하면 자동으로 capa 증가
        ArrayList list = new ArrayList(2);
        list.add("A");
        list.add("C");
        list.add("E");
        list.add("D");
        list.add(30);

        System.out.println("초기상태 : ");
        System.out.println(list);

        System.out.println("인덱스 1 위치에 B 추가 : ");
        list.add(1, "B");
        System.out.println(list);

        System.out.println("인덱스 2 위치의 값 삭제 : ");
        list.remove(2);
        System.out.println(list); // [A , B , E , D]

        System.out.println("인덱스 2번 위치의 값 반환 : " + list.get(2)); // E


    }
}
