//********** interface & abstract ********//
// Abstract class = base class
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {   // common implementation
        System.out.println(brand + " is starting...");
    }

    abstract void drive();  // har vehicle alag tarike se drive karega
}

// Interface = rulebook
interface GPS {
    void showLocation();
}

// Class = concrete implementation
class Car extends Vehicle implements GPS {
    Car(String brand) {
        super(brand);
    }

    // abstract method ka implementation
    void drive() {
        System.out.println(brand + " is driving on the road.");
    }

    // interface method ka implementation
    public void showLocation() {
        System.out.println(brand + " GPS showing location: Indore");
    }
}

public class file31 {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla");

        c1.start();        // from abstract class
        c1.drive();        // overridden method
        c1.showLocation(); // from interface
    }
}
