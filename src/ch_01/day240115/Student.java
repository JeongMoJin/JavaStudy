package ch_01.day240115;

public class Student {
    private String name;
    private int ban, no, kor, eng, math;

    public Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }
    public void updateRecord(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public String getName(){return name;}
    public int getTotal(){return kor+eng+math;}
    public double getAverage(){return Math.round((double)getTotal()/3*100D)/100D;}
}
