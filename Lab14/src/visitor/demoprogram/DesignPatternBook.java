package visitor.demoprogram;

public class DesignPatternBook extends ProgramingBook {
    private String resource;
    private String bestSeller;
    public DesignPatternBook(String resource, String bestSeller, double price) {
        super(price);
        this.resource = resource;
        this.bestSeller = bestSeller;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return resource;
    }

    public String getBestSeller() {
        return bestSeller;
    }
}
