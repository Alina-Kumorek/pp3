// 13.	Create a project that describes the different types of vehicles. Define an abstract class Vehicle.
// Consider what attributes and methods (including abstract ones) an abstract class should contain.
// Add a constructor in the class to create a vehicle. Then, using inheritance,
// define Car, Bus, Truck classes representing specific types of vehicles.
// Consider what attributes and methods should these classes contain. Finally, create one car,
// bus and truck and display details on them.

public abstract class Vehicle {
    private int seats;
    private int maxSpeed;
    
    public Vehicle(int seats, int maxSpeed) {
        this.seats = seats;
        this.maxSpeed = maxSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void specs();
}