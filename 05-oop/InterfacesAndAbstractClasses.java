interface Payable {
    double calculatePay();
}

abstract class Employee implements Payable {
    protected final String name;

    Employee(String name) { this.name = name; }
}

class SalariedEmployee extends Employee {
    private final double monthlySalary;

    SalariedEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() { return monthlySalary; }
}

public class InterfacesAndAbstractClasses {
    public static void main(String[] args) {
        Payable employee = new SalariedEmployee("Mira", 45000);
        System.out.println(employee.calculatePay());
    }
}
