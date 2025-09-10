class Vehicle{

void displaySpeed(){
System.out.println("Vehicle speed unknown");
 }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Car speed 120 km/h");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Bike speed 80 km/h");
    }
}

// Main class to test
public class VehicleSpeed {
    public static void main(String[] args) {
        // Hardcoded input
        String input1 = "Car";
        String input2 = "Bike";

        // Call method for each input
        printVehicleSpeed(input1);
        printVehicleSpeed(input2);
    }

    static void printVehicleSpeed(String type) {
        Vehicle vehicle;
        if (type.equalsIgnoreCase("Car")) {
            vehicle = new Car();
        } else if (type.equalsIgnoreCase("Bike")) {
            vehicle = new Bike();
        } else {
            vehicle = new Vehicle();
        }
        vehicle.displaySpeed();
    }
}