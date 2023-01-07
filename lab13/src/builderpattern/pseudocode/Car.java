package builderpattern.pseudocode;

public class Car {
    private int seats;
    private String engine;
    private String tripComputer;
    private String GPS;

    public Car() {
    }

    public Car(int seats, String engine, String tripComputer, String GPS) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.GPS = GPS;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    public String getGPS() {
        return GPS;
    }

    public void setGPS(String GPS) {
        this.GPS = GPS;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", tripComputer='" + tripComputer + '\'' +
                ", GPS='" + GPS + '\'' +
                '}';
    }
}
