package ch_01.day240112;

public class Tv_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1.toString()값은 " + t1.toString() + "입니다.");
        System.out.println("t2.toString()값은 " + t2.toString() + "입니다.");
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
        System.out.println();

        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
        System.out.println();

        t1 = t2;
        System.out.println("t1.toString()값은 " + t1.toString() + "입니다.");
        System.out.println("t2.toString()값은 " + t2.toString() + "입니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
        System.out.println();

        t1.channel = 27;
        System.out.println("t1의 channel값을 27로 변경하였습니다.");
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
    }
}
