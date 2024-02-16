package ch_01.day240216.adapter;

interface AdapterService {
    void runService();
}

class AdapterServiceA implements AdapterService {
    WorkMan workMan = new WorkMan();

    @Override
    public void runService() { workMan.runWork();}
}

class AdapterServiceB implements AdapterService{
    StudyStudent studyStudent = new StudyStudent();

    @Override
    public void runService() { studyStudent.runStudy();}
}
public class Adapter {
    public static void main(String[] args) {
        AdapterService asa1 = new AdapterServiceA();
        AdapterService asb1 = new AdapterServiceB();

        asa1.runService();
        asb1.runService();
    }
}