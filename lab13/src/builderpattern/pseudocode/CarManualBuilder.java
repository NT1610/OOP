package builderpattern.pseudocode;

public class CarManualBuilder implements Builder{

    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        this.manual.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.manual.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(String gps) {
        this.manual.setGPS(gps);
    }

    public Manual getResult() {
        return this.manual;
    }
}
