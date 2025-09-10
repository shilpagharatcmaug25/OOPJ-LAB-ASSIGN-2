abstract class Employee{

abstract double calculateBonus();

String name;
double salary;

Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
		}

}	

class Manager extends Employee{

Manager(String name, double salary) {
        super(name, salary);
    }
	@Override

double calculateBonus() {
        return salary * 0.20;
    }
}
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    // Implement bonus as 10% of salary
    @Override
    double calculateBonus() {
        return salary * 0.10;
    }
}
public class BonusCalculator {
    public static void main(String[] args) {
        Employee manager = new Manager("Anita", 50000);
        Employee developer = new Developer("Rohit", 40000);

        System.out.println(manager.name + " Bonus = " + (int)manager.calculateBonus());
        System.out.println(developer.name + " Bonus = " + (int)developer.calculateBonus());
    }
}
