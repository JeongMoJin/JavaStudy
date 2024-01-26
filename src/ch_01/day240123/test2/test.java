package ch_01.day240123.test2;

interface Buy {
    void buy();
    default void order() {
        System.out.println("구매 주문");
    }
}
interface Sell {
    void sell();
    default void order() {
        System.out.println("판매 주문");
    }
}
class Customer implements Buy, Sell {
    public void buy() {
        System.out.println("구매하기");
    }
    public void sell() {
        System.out.println("판매하기");
    }

    @Override
    public void order() {
        System.out.println("고객 판매 주문");
    }
}
public class test {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        buyer.order();

        if (seller instanceof Customer) {
            Customer customer2 = (Customer) seller;
            customer2.buy();
            customer2.sell();
        }
        customer.order();
    }
}
