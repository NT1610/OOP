package visitor.demoprogram;

public class VisitorImpl implements Visitor {
    private double totalPrice;

    @Override
    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public void visit(BusinessBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getPublisher());
        System.out.println(book.getPrice());
    }

    @Override
    public void visit(DesignPatternBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getResource());
        System.out.println(book.getBestSeller());
        System.out.println(book.getPrice());
    }

    @Override
    public void visit(JavaCoreBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getFavouriteBook());
        System.out.println(book.getResource());
        System.out.println(book.getPrice());
    }
}
