package iteratorpattern.pseudocode;

import java.util.Arrays;

public class ProductCatalog implements Iterable {
    private String[] productCatalog;
    private final int SIZE = 100;
    int length;

    public ProductCatalog() {
        productCatalog = new String[SIZE];
        this.length = -1;
    }

    @Override
    public Iterator getIterator() {
        return new ProductInterator(productCatalog, this.length + 1);
    }

    public ProductCatalog add(String product) {
        if (length >= this.productCatalog.length - 1) {
            return this;
        }
        this.productCatalog[this.length + 1] = product;
        this.length++;
        return this;
    }
}
