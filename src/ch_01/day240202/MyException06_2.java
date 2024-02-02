package ch_01.day240202;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyException06_2 {
    public static void main(String[] args) {
        // fubally를 사용하는 예
        String path = ".\\sample_file\\test.txt";

        try (FileInputStream fileInputStream = new FileInputStream(path)){
            System.out.println("지정한 경로에 파일이 존재합니다.");
        } catch (FileNotFoundException e) {
            System.out.println("지정한 경로에 파일이 존재하지 않습니다.");
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
