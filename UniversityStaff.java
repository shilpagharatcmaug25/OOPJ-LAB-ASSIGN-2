class Staff{
String name;
double salary;
Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
	void displayInfo() {
        System.out.println(name + " -- " + salary);
    }

}

class TeachingStaff extends Staff{
String subject;
TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }
	@Override
	
	void displayInfo() {
        System.out.println(name + " → " + subject + ", " + salary);
    }
}
class NonTeachingStaff extends Staff {
    String department;

    NonTeachingStaff(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " → " + department + ", " + salary);
    }
}

// Main class
public class UniversityStaff {
    public static void main(String[] args) {
        TeachingStaff t = new TeachingStaff("Anita", 50000, "Math");
        NonTeachingStaff n = new NonTeachingStaff("Ramesh", 40000, "Admin");

        t.displayInfo();
        n.displayInfo();
    }
}

