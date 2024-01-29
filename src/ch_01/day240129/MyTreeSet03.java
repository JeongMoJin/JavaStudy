package ch_01.day240129;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return (s1.compareTo(s2)) * -1; // String 클래스의 compareTo() 메서를 반대로.
    }
}

public class MyTreeSet03 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        System.out.println(set);
    }
}
