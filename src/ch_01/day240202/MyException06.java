package ch_01.day240202;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyException06 {
    public static void main(String[] args) {
        // fubally를 사용하는 예
        String path = ".\\sample_file\\test.txt";
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(path);
            System.out.println("지정한 경로에 파일이 존재합니다.");
        } catch (FileNotFoundException e) {
            System.out.println("지정한 경로에 파일이 존재하지 않습니다.");
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                }catch (IOException e) {;}
                System.out.println("파일을 닫았습니다.");
            }
            System.out.println("자원을 해제하고 종료합니다.");
        }
    }
}
