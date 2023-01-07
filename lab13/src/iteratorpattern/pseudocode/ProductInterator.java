package iteratorpattern.pseudocode;

public class ProductInterator implements Iterator {
    private String[] productCatalog;
    private int length;
    private int currentPosition;

    public ProductInterator(String[] productCatalog, int length) {
        this.productCatalog = productCatalog;
        this.length = length;
    }

    @Override
    public boolean hasNext() {
        return ((currentPosition <= this.productCatalog.length - 1) && (currentPosition <= length - 1));
    }

    @Override
    public Object next() {
//        String currentProduct = this.productCatalog[currentPosition];
//        currentPosition++;
//        return currentProduct;
        if (hasNext()) {
            return this.productCatalog[currentPosition++];
        }
        return null;
    }
}
