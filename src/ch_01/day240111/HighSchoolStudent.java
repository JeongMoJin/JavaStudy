package ch_01.day240111;

public class HighSchoolStudent {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() {
       return kor + eng + math;
    }
    double getAverage() {
        return (double)getTotal()/3;
    }
}
