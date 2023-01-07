package visitor.demoprogram;

public class App {
    public static void main(String[] args) {
        Visitor v = new VisitorImpl();

        Book businessBook1 = new BusinessBook("DHQG", 50.0);
        businessBook1.accept(v);
        System.out.println();

        Book designPatternBook1 = new DesignPatternBook("Store", "Face", 70);
        designPatternBook1.accept(v);
        System.out.println();

        Book javaCoreBook1 = new JavaCoreBook("Store", "Google", 60);
        javaCoreBook1.accept(v);
        System.out.println();

        System.out.println("Price of all books: " + v.getTotalPrice());
    }

}

