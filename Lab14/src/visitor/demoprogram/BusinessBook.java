package visitor.demoprogram;

public class BusinessBook extends Book {

    private String publisher;

    private double price;

    public double getPrice() {
        return price;
    }

    public BusinessBook(String publisher, double price) {
        this.publisher = publisher;
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getPublisher() {
        return this.publisher;
    }
}
