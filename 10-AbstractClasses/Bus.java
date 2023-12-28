public class Bus extends Vehicle{
    private int standingPassengers;

    public Bus(int seats, int maxSpeed, int standingPassengers) {
        super(seats, maxSpeed);
        this.standingPassengers = standingPassengers;
    }

    public int getStandingPassengers() {
        return standingPassengers;
    }

    public void setStandingPassengers(int standingPassengers) {
        this.standingPassengers = standingPassengers;
    }

    @Override
    public void specs() {
        System.out.println("Seats: " + getSeats());
        System.out.println("Standing Passengers: " + standingPassengers);
        System.out.println("Max Speed: " + getMaxSpeed() + " km/h");
    }
}