package ch_01.day240112.student;

public class Student {
    String name;
    String rollNo;
    int age;
    
    public Student(String name, String rollNo, int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;

        System.out.println("학생의 이름 : " + name);
        System.out.println("학생의 학번 : " + rollNo);
        System.out.println("학생의 나이 : " + age);
        System.out.println("Student 객체가 생성되었습니다.");
    }
}
