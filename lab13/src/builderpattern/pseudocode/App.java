package builderpattern.pseudocode;

public class App {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        System.out.println(builder.getResult());
        CarManualBuilder builder1 = new CarManualBuilder();
        director.constructSportsCar(builder1);
    }
}
