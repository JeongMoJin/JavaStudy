package ch_01.day240119;

public class SahapeTest3 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Rectangle();
        shapes[1] = new Triangle();
        shapes[2] = new Circle();

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
    }
}
