package ch_01.day240126;

import java.util.Stack;

class Coin {
    private int value;
    public Coin (int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
public class MyStack_02 {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        while (!(coinBox.size()==0)) {
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }
        /*
        꺼내온 동전 : 10원
        꺼내온 동전 : 500원
        꺼내온 동전 : 50원
        꺼내온 동전 : 100원
         */
    }
}
