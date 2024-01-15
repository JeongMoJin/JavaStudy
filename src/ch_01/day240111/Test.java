package ch_01.day240111;

class Student {
    String name;
    int grade;
    int kor;
    int eng;
    int math;

    void printStudent() {
        System.out.println(name + "은 " + grade + "학년이고, 국어 성적은 " + kor + "점 입니다.");
    }
}
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "김철수";
        student1.grade = 2;
        student1.kor = 100;
        student1.eng = 90;
        student1.math = 88;

        Student student2 = new Student();
        student2.name = "박영수";
        student2.grade = 1;
        student2.kor = 90;
        student2.eng = 70;
        student2.math = 98;

        student1.printStudent();
        student2.printStudent();
    }

}
