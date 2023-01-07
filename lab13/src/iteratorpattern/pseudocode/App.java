package iteratorpattern.pseudocode;

public class App {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.add("apple")
                .add("banana")
                .add("orange")
                .add("Coconut")
                .add("Grape");
        for (Iterator i = productCatalog.getIterator(); i.hasNext(); ) {
            System.out.println(i.next());
        }
    }
}
