package ch_01.day240122;

final class FinalCalss1 {
    final int number = 4;
}

class Parents
{
    final void finalMethod(){
        System.out.println("상속 불가한 메서드");
    }
}
class Son extends Parents {

}
public class FinalCalss {
    public static void main(String[] args) {
        FinalCalss1 member1 = new FinalCalss1();
        System.out.println(member1.number);
    }
}

