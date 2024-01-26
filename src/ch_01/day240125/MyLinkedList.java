package ch_01.day240125;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println(linkedList);

        linkedList.add(1, "0");
        System.out.println(linkedList);

        System.out.println(linkedList);
        System.out.println(linkedList);
    }
}
