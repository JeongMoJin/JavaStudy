package ch_01.day240122.abstractPackage;

public class Test {
    public static void main(String[] args) {
        University university = new University("홍길동", 2, 24);
        Elementary elementary = new Elementary("박지성", 3);

        Student[] students = new Student[2];
        students[0] = university;
        students[1] = elementary;
        for (Student student : students) {
            System.out.println("학생 이름: " + student.getName());
            System.out.println(student.getTeacher());
        }
    }
}
