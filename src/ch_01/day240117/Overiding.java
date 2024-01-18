package ch_01.day240117;

class Shape{
    public void draw() {
        System.out.println("Shape 중의 하나를 그릴 예정입니다.");
    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("Circle을 그립니다.");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw() {
        super.draw();
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        super.draw();
    }
}

public class Overiding {
    public static void main(String[] args) {
        Circle s = new Circle();
        s.draw();
    }
}
