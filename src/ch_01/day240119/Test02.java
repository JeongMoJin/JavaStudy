package ch_01.day240119;

public class Test02 {
    public static void main(String[] args) {
        FireEngine fireEngine = new FireEngine();
        if (fireEngine instanceof FireEngine) System.out.println("FireEngine");
        if (fireEngine instanceof Car) System.out.println("Car");
        if (fireEngine instanceof Object) System.out.println("Object");
        System.out.println();

        Car polyFireEngine = new FireEngine();
        if (polyFireEngine instanceof FireEngine) System.out.println("poly > FireEngine");
        if (polyFireEngine instanceof Car) System.out.println("poly > Car");
        if (polyFireEngine instanceof Object) System.out.println("poly > Object");
        System.out.println();

        Car car = new Car();
        if (car instanceof FireEngine) System.out.println("car > FireEngine");
        if (car instanceof Car) System.out.println("car > Car");
        if (car instanceof Object) System.out.println("car > Object");
        System.out.println();
    }
}
