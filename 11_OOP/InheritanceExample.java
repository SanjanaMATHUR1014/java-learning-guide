class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void speed() {
        System.out.println("Speed is 60km/h");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
        b.speed();
    }
}
