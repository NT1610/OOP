package visitor.demoprogram;

public class ProgramingBook extends Book {

    private String resource;
    private double price;

    public ProgramingBook(String resource, double price) {
        this.resource = resource;
        this.price = price;
    }

    public ProgramingBook(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
    }

    public String getResource() {
        return this.resource;
    }
}
