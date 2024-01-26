package ch_01.day240124.studentTest;

public class Student {
    private String studentID;
    private String studentName;
    private int score;

    private Course[] courses = new Course[10]; // 객체 배열 생성
    private int idx = 0; // 배열 생성 시 증가 인덱스 생성

    public Student(String studentID, String studentName, int score) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.score = score;
    }

    static class Course {
        String courseName;
        String courseGrade;

        public Course(String courseName, String courseGrade) {
            this.courseName = courseName;
            this.courseGrade = courseGrade;
        }

        public String getCourseName() {
            return courseName;
        }

        public String getCourseGrade() {
            return courseGrade;
        }
    }

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    void addCourse (String courseName, String courseGrade) {

        courses[idx++] = new Course(courseName, courseGrade);
    }

    Course[] getCourseList() {
        return courses;
    }
    public int getIdx() {
        return idx;
    }

}











