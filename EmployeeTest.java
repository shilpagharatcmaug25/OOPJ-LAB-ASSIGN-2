class Employee{

String name;
double basicSalary;

Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to be overridden by subclasses
    double calculateNetSalary() {
        return basicSalary;
    }
}

// Subclass RegularEmployee
class RegularEmployee extends Employee {
    RegularEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double calculateNetSalary() {
        double hra = 0.10 * basicSalary;
        return basicSalary + hra;
    }
}

// Subclass ContractEmployee
class ContractEmployee extends Employee {
    ContractEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double calculateNetSalary() {
        double allowance = 0.05 * basicSalary;
        return basicSalary + allowance;
    }
}

// Main class to test the implementation
public class EmployeeTest {
    public static void main(String[] args) {
        RegularEmployee rahul = new RegularEmployee("Rahul", 20000);
        ContractEmployee riya = new ContractEmployee("Riya", 15000);

        System.out.println(rahul.name + " Net Salary = " + (int)rahul.calculateNetSalary());
        System.out.println(riya.name + " Net Salary = " + (int)riya.calculateNetSalary());
    }
}