package ch_01.day240117;

class Circle2{
    protected int radius;
    public Circle2 (int radius) {
        this.radius = radius;
    }
}
class Pizza extends Circle2 {
    protected String piz;
    public Pizza(String piz, int radius) {
        super(radius);
        this.piz = piz;
    }
    public void print(){
        System.out.println("피자의 종류 : "+ piz + ", 피자의 크기 : "+(super.radius*2));
    }
}
public class CircleTest {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Peooeroni", 10);
        pizza.print();
    }
}
