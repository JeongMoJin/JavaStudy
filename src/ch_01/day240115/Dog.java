package ch_01.day240115;

public class Dog {
    private String name;
    private String bread;
    private int age;

    public Dog (String name, String bread, int age) {
        this.name = name;
        this.bread = bread;
        this.age = age;
    }
    public Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {return name;}
    public String getBread() {return bread;}
    public int getAge() {return age;}
    public void setName(String name) {this.name = name;}
    public void setBread(String bread) {this.bread = bread;}
    public void setAge(int age) {this.age = age;}
    public void braking() {
        System.out.println("멍멍!!");
    }
    public String toString() {
        return "Dog : name = " + name + ", bread = " + bread + ", age = " + age;
    }
}
