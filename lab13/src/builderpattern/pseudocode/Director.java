package builderpattern.pseudocode;

public class Director {
    public Director() {
    }

    public void constructSportsCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("SportEngine");
        builder.setTripComputer("true");
        builder.setGPS("123456");
    }
    public void constructSUV(Builder builder){
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("SportEngine");
        builder.setTripComputer("true");
        builder.setGPS("123456");
    }
}
