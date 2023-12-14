public class Car {
    public String brand;
    public String model;
    public int amountOfFuel;

    public Car() {
     
        this.brand = "";
        this.model = "";
        this.amountOfFuel = 0;
    }

    public Car(String Car_brand, String Car_model, int Car_amountOfFuel) {
        this.brand = Car_brand;
        this.model = Car_model;
        this.amountOfFuel = Car_amountOfFuel;
    }

    public void brake() {
        System.out.println("Car is braking");
    }

    public void accelerate() {
        if (amountOfFuel > 0) {
            System.out.println("Car is accelerating");
            amountOfFuel--;
        } else {
            System.out.println("Out of fuel, cannot accelerate!");
        }
    }

    public void printData() {
        System.out.println("Brand is: " + brand + ", Model is: " + model + ", Fuel is: " + amountOfFuel);
    }

    public void refuel(int amount) {
        System.out.println("Fuel in the tank: " + amountOfFuel);
        System.out.println("Refuel: " + amount);
        amountOfFuel += amount;
        System.out.println("Fuel in the tank after refuel: " + amountOfFuel);
    }

   
    
}