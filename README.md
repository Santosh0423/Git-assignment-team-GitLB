# Git-assignment-team-GitLB

public class Car {
    public String brand;
    public String model;
    public int amountOfFuel;
  
    void brake() {
        System.out.println("Car is breaking");
    }

    void accelerate() {
        if (amountOfFuel > 0) {
            amountOfFuel = amountOfFuel - 1;
            System.out.println("Car is accelerating ");
        } 
    }

    void printData() {
        System.out.println("Brand: " +brand);
        System.out.println("Model: " +model);
        System.out.println("Fuel: " +amountOfFuel);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Kia";
        car1.model = "Cmary";
        car1.amountOfFuel = 50;
        car1.brake();
        car1.accelerate();
        car1.printData();
    }
}
