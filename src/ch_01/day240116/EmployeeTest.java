package ch_01.day240116;

class Employee {
    private int baseSalary = 3000000;
    public int getSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private int salary = 2000000;
    @Override
    public int getSalary() {
        return super.getSalary() + salary;
    }
}
class Programmer extends Employee {
    private int salary = 3000000;
    @Override
    public int getSalary() {
        return super.getSalary() + salary;
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println("관리자의 월급 : " + manager.getSalary()); // 5000000

        Programmer programmer = new Programmer();
        System.out.println("프로그래머의 월급 : " + programmer.getSalary()); // 6000000
    }
}
