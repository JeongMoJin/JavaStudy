package ch_01.day240116;

import java.util.Arrays;
import java.util.Scanner;

public class TestContacts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contacts[] contacts = new Contacts[100];

        System.out.println("연락처를 입력하시오 (종료 -1)");
        for (int i = 0; i < contacts.length; i++) {
            System.out.print("이름과 전화번호 이메일을 입력하세요: ");
            String inputs = scanner.nextLine();
            if(!inputs.equals("-1")){
                String[] datas = inputs.split(" ");
                System.out.println(Arrays.toString(datas));
                contacts[i] = new Contacts(datas[0], datas[1], datas[2]);
                System.out.println(contacts[i]);
                Contacts.count++;
            } else {
                System.out.println("지인들의 수는 " + Contacts.count + "명입니다.");
                break;
            }
        }
        System.out.println("검색할 이름을 입력하시오: ");
        String findName = scanner.nextLine();
        // 같은 이름이 여러명 있을 수 있다는 가정 case 1.
        for (int i = 0; i< contacts.length; i++) {
            if(contacts[i] != null && findName.equals(contacts[i].getName())) {
                System.out.println(contacts[i].getName() + "의 전화번호: " + contacts[i].getTel()
                        + " 이메일 : " + contacts[i].getEmail());
            }
        }
        // 개선 코드 case2.
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (findName.equals(contacts[i].getName())){
                    System.out.println(contacts[i].getName() + "의 전화번호 :"
                    + contacts[i].getTel() + " 이메일 : " + contacts[i].getEmail());
                }
            } else {
                break;
            }
        }

        // 저장된 갯수만큼 반복 case3. (가장 좋음)
        for (int i = 0; i < Contacts.count; i++) {
            if(findName.equals(contacts[i].getName())) {
                System.out.println(contacts[i].getName() + "의 전화번호: " + contacts[i].getTel()
                + " 이메일 : "+ contacts[i].getEmail());
            }
        }






    }
}
