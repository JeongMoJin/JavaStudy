package ch_01.day240112;

public class StudentTest {
    public static void main(String[] args) {
        Student studentJin = new Student();
        studentJin.studentName = "진정모";

        System.out.println(studentJin.studentName);
        System.out.println(studentJin.getStudentName());
    }
}
