public class Truck extends Vehicle {
    private float cargo;

    public Truck(int maxSpeed, float cargo) {
        super(2, maxSpeed);
        this.cargo = cargo;
    }

    public float getCargo() {
        return cargo;
    }

    public void setCargo(float cargo) {
        this.cargo = cargo;
    }

    @Override
    public void specs() {
        System.out.println("Cargo: " + cargo + " t");
        System.out.println("Seats: " + getSeats());
        System.out.println("Max Speed: " + getMaxSpeed() + " km/h");
    }
}