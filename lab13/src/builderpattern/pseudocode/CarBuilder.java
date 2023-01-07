package builderpattern.pseudocode;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {

    }

    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(String gps) {
        this.car.setGPS(gps);
    }

    public Car getResult() {
        return this.car;
    }
}
