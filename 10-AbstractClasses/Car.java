public class Car extends Vehicle {
    private String type;

    public Car(int seats, int maxSpeed, String type) {
        super(seats, maxSpeed);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void specs() {
        System.out.println("Type: " + type);
        System.out.println("Seats: " + getSeats());
        System.out.println("Max Speed: " + getMaxSpeed() + " km/h");
    }
}