package ch_01.day240116;



public class Contacts {
     String name, tel, email;
     static int count;

    public Contacts(String data, String data1, String data2) {
        this.name = data;
        this.tel = data1;
        this.email = data2;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }
    //    public Contacts(String name, String tel, String email){
//        this.name = name;
//        this.tel = tel;
//        this.email = email;
//        count++;
//    }
}
