package ch_01.day240126;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet_02 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("JAVA");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("JAVA"); // JAVA는 한 번만 저장됨.
        set.add("iBATIS");

        int size = set.size(); // 저장된 객체 수 얻기
        System.out.println("총 객체수: " + size); // 총 객체수 : 4

        System.out.println("foreach 문으로 출력 시작");
        for (String s : set) {
            System.out.println("\t" + s);
        }
        System.out.println();

        Iterator<String> iterator = set.iterator(); // 반복자 얻기
        while (iterator.hasNext()) { // 객체 수만큼 루핑
            String element = iterator.next(); // 1개의 객체를 가져옴.
            System.out.println("\t" + element);
        }
        set.remove("JDBC"); // 1개의 객체 삭제
        set.remove("iBATIS"); // 1개의 객체 삭제

        System.out.println("총 객체수: " + set.size());

        System.out.println("foreach 문으로 출력 시작");
        for (String s : set) {
            System.out.println("\t" + s);
        }
        System.out.println();

        set.clear(); // 모든 객체를 제거하고 비움.
        if(set.isEmpty()) {
            System.out.println("비어 있음");
        }
    }
}











