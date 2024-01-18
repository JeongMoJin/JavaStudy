package ch_01.day240117;

import kotlin.CharCodeJVMKt;

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;
    void method() {
        int x = 30;
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        // 부모와 자식 간 변수가 겹치게 될 때, super.으로 구분이 가능하다
        System.out.println("super.x = "+ super.x);
    }
}
public class ParameterTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
