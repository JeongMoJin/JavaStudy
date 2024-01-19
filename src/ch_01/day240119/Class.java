package ch_01.day240119;

class Shape {
    protected int x,y;
    public void draw() {
        System.out.println("Shape Draw");
    }
}
class Rectangle extends Shape {
    public int width, height;
    @Override
    public void draw() {
        System.out.println("Rectangle Draw");
    }
}
class Triangle extends Shape {
    public int base, height;
    @Override
    public void draw() {
        System.out.println("Triangle Draw");
    }
}
class Circle extends Shape {
    public int radius;
    @Override
    public void draw() {
        System.out.println("Circle Draw");
    }
}
public class Class {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.x = 0;
        shape.y = 0;
        Rectangle rectangle = new Rectangle();
        rectangle.width = 0;
    }
}
