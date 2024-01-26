package ch_01.day240126;

import java.util.LinkedList;

class MyQueue {
    private LinkedList<String> linkedList = new LinkedList<>();

    public void enQueue(String data) {
        linkedList.add(data);
    }
    public String deQueue() {
        int len = linkedList.size();
        if (len == 0) {
            System.out.println("큐가 비었습니다.");
            return null;
        }
        return (linkedList.remove(0)); // 맨 앞의 자료 반환하고 배열에서 제거
    }
}
public class MyQueue_01 {
    public static void main(String[] args){
        MyQueue queue = new MyQueue();
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        System.out.println(queue.deQueue()); // A
        System.out.println(queue.deQueue()); // B
        System.out.println(queue.deQueue()); // C
    }
}







