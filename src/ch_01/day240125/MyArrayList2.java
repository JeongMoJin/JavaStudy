package ch_01.day240125;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList2 {
    // String 객체를 저장하는 ArrayList
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("JDBC");
        list.add("Serverlet/JSP");
        list.add(2, "Database");
        list.add("iBATIS");

        int size = list.size(); // 저장된 총 객체수 얻기
        System.out.println("총 객체수 : " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2: " + skill);
        System.out.println();

        for (int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
        System.out.println();
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("iBATIS");

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
    }
}
