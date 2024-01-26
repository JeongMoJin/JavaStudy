package ch_01.day240125;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyListLinkedList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        System.out.println("1. 중간에 추가하는 경우");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간 : " + (endTime-startTime) + " ns" );

        startTime = System.nanoTime();
        for(int i =0; i < 100000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린시간 : " + (endTime - startTime) + " ns"); // linkedList가 훨씬 성능 좋다 빠르다

        System.out.println("2. 끝에 순차적으로 추가하는 경우");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list1.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간: " + (endTime-startTime)+ " ns");

        startTime = System.nanoTime();
        for(int i = 0; i < 100000; i++) {
            list2.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린시간 : " + (endTime-startTime) + " ns"); // 중간보다는 차이가 덜 하다
    }
}
