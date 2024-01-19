package ch_01.day240119;

public class ShapeTest4 {
    public static void print(Shape shape){
        System.out.println("x= "+shape.x+" y= "+shape.y);
    }

    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle();
        Triangle shape2 = new Triangle();
        Circle shape3 = new Circle();

        print(shape1);
        print(shape2);
        print(shape3);
    }
}
