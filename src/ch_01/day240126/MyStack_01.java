package ch_01.day240126;

import java.util.ArrayList;

class MyStack {
    // push, peek, pop
    private ArrayList<String> arrayStack = new ArrayList<>();

    public void push(String data) { // 스택의 맨 뒤에 요소를 추가
        arrayStack.add(data);
    }
    
    public String pop() {
        int len = arrayStack.size(); // 저장된 개수
        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return (arrayStack.remove(len-1)); // 맨 뒤에 있는 자료 반환하고 배열에서 제거
    }
    public String peek() {
        int len = arrayStack.size(); // 저장된 개수
        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return (arrayStack.get(len-1)); // 맨 뒤에 있는 자료 반환
    }
}
public class MyStack_01 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

















