class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car - " + brand + ", Speed: " + speed + " km/h");
    }
}

class Truck extends Vehicle {
    public Truck(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck - " + brand + ", Speed: " + speed + " km/h");
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 180);
        Vehicle truck = new Truck("Nissan", 120);

        car.displayInfo();
        truck.displayInfo();
    }
}
