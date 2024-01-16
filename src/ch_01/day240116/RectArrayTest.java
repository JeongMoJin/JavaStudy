package ch_01.day240116;

class Rect {
    int width, height;

    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }
    double getArea() {return (double)width*height;}
}
public class RectArrayTest {
    public static void main(String[] args) {
        Rect[] list;
        list = new Rect[5];

        for(int i = 0; i < list.length; i++) {
            System.out.println(i + "번째 사각형의 면적 = "+list[i].getArea());
        }
    }
}









