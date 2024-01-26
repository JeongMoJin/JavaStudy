package ch_01.day240123.test;

interface Buy {
    void buy();
    void info();
}
interface Sell {
    void sell();
    void info();
}

class Customer implements Buy, Sell {
    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }

    @Override
    public void info() {
        System.out.println("Customer 입니다.");
    }
}

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();

        Sell seller = (Sell)customer;
        seller.sell();

        if (seller instanceof Customer) {
            Customer customer2 = (Customer) seller;
            customer2.buy();
            customer2.sell();
        }
    }
}
