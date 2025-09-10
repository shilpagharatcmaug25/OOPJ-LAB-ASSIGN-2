class Employee{

String name;
double salary;



Employee(String name,double salary){
this.name=name;
this.salary=salary;
}

void displaySalary(){
System.out.println(name + " Total Salary = " + salary);
    }
}

class Manager extends Employee{
Manager(String name, double salary) {
        super(name, salary);
    }
@Override
   void displaySalary() {
        double totalSalary = salary + (0.20 * salary);
        System.out.println(name + " Total Salary = " + (int)totalSalary);
    }
}
class Developer extends Employee {

    // Constructor
    Developer(String name, double salary) {
        super(name, salary);
    }

    // Overridden method to include 10% bonus
    @Override
   void displaySalary() {
        double totalSalary = salary + (0.10 * salary);
        System.out.println(name + " Total Salary = " + (int)totalSalary);
    }
}
public class EmployeeBonus{
public static void main(String args[]){
Manager m=new Manager("Anita",50000);
Developer d=new Developer("Rohit",40000);

m.displaySalary();
d.displaySalary();

}
}