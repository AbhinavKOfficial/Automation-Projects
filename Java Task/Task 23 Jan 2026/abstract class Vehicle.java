abstract class Vehicle {

    abstract void start();

    void fuelType() {
        System.out.println("Fuel type: Petrol");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with the key.");
    }
}

public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.fuelType();

    }
}