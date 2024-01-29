package ch_01.day240129;

import java.util.HashMap;
import java.util.Map;

class Student { // 학번과 키가 같다면 동일한 키로 인식
    public int sno;
    public String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }
}
public class MyMap02 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student(1,"홍길동"), 95);
        map.put(new Student(1,"홍길동"), 95);
        map.put(new Student(1,"박유신"), 95);

        System.out.println("총 Entry 수 : " + map.size()); //
    }
}











