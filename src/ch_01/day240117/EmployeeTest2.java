package ch_01.day240117;

class Employee {
    private String name;
    private int employeeId, salary;

    public Employee(String name, int employeeId, int salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    int calculateSalary() {
        return salary;
    }
}

class FullTimeEmployee extends Employee {
    private int monthlySalary;

    public FullTimeEmployee(String name, int employeeId, int monthlySalary) {
        super(name, employeeId, monthlySalary);
        this.monthlySalary = monthlySalary;
    }

    @Override
    int calculateSalary() {
        return monthlySalary * 12;
    }
}

class ContractEmployee extends Employee {
    private int monthlySalary, contractDuration;

    public ContractEmployee(String name, int employeeId, int contractDuration, int monthlySalary) {
        super(name, employeeId, monthlySalary);
        this.contractDuration = contractDuration;
        this.monthlySalary = monthlySalary;
    }

    @Override
    int calculateSalary() {
        return monthlySalary * contractDuration;
    }
}

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee E = new Employee("근무자", 100, 3000000);
        FullTimeEmployee F = new FullTimeEmployee("풀근무자", 101, 3000000);
        ContractEmployee C = new ContractEmployee("계약근무자", 102, 6, 3000000);

        System.out.println(E.calculateSalary());
        System.out.println(F.calculateSalary());
        System.out.println(C.calculateSalary());
    }
}

