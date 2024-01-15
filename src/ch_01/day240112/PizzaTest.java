package ch_01.day240112;

class Pizza {
    int size;
    String type;

    public Pizza() {

    }

    public Pizza(int s, String t) {
        size = s;
        type = t;
    } // 생성자를 하나라도 만들었을 경우 빈 생성자 따로 생성 안됨
}
public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        System.out.println("(" + pizza1.type + ", " + pizza1.size + ")");

        Pizza pizza2 = new Pizza(24, "포테이토");
        System.out.println("(" + pizza2.type + ", " + pizza2.size + ")");
    }
}













