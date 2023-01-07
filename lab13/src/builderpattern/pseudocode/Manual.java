package builderpattern.pseudocode;

public class Manual {
    private String carType;
    private int seats;
    private String engine;
    private String tripComputer;
    private String GPS;

    public Manual() {
    }

    public Manual(String carType, int seats, String engine, String tripComputer, String GPS) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.GPS = GPS;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
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

    public void setGPS(String gps) {
        this.GPS = gps;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "carType='" + carType + '\'' +
                ", seats=" + seats +
                ", engine='" + engine + '\'' +
                ", tripComputer='" + tripComputer + '\'' +
                ", GPS='" + GPS + '\'' +
                '}';
    }
}
