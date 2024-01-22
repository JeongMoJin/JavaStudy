package ch_01.day240122.abstractPackage;

public class Elementary extends Student {

    public Elementary(String name, int grade, String teacher) {
        super.name = name;
        super.grade = grade;
        super.teacher = teacher;
    }
    public Elementary(String name, int grade) {
        super.name = name;
        super.grade = grade;
    }

    @Override
    public String getTeacher() {
        return "담당 선생님 : " + super.teacher;
    }
}
