package ch_01.day240115;

class Single{
    private static Single instance = null;

    private Single() {

    }

    public static Single getInstance() {
        if (instance == null){
            instance = new Single();
        }
        return instance;
    }
}
public class Singleton2 {
    public static void main(String[] args) {
        Single obj1 = Single.getInstance();
        Single obj2 = Single.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}









