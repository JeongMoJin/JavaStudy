package ch_01.day240119.ClassD;

import java.util.ArrayList;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    ArrayList<Product> products = new ArrayList();
    void buy (Product product) {
        if (money < product.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= product.price;
        bonusPoint += product.bonusPoint;
        products.add(product);
        System.out.println(product + "을/를 구입하셨습니다.");
    }
    void summary() {
        int sum = 0;
        String itemList = "";

        if(products.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다");
            return;
        }

        for(int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            sum += product.price;
            itemList += (i==0) ? "" + product : ", " + product;
        }

//        for (int i = 0; i < products.length; i++) {
//            if(products[i] == null) break;
//            sum += products[i].price;
//            itemList += products[i] + ", ";
//        }
//
//        for(Product product : products) {
//            if (product == null) break;
//            sum += product.price;
//            itemList += product + ", ";
//        }
//
//        for(int i = 0; i < this.i; i++) {
//            sum += products[i].price;
//            itemList += products[i] + ", ";
//        }

        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
    void refund(Product product) {
        if(products.remove(product)) {
            money += product.price;
            bonusPoint -= product.bonusPoint;
            System.out.println(product + "을/를 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }
}
