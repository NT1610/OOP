package visitor.demoprogram;

public class JavaCoreBook extends ProgramingBook {
    private String resource;
    private String favouriteBook;

    public JavaCoreBook(String resource, String favouriteBook, double price) {
        super(price);
        this.resource = resource;
        this.favouriteBook = favouriteBook;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getFavouriteBook() {
        return favouriteBook;
    }

    @Override
    public String getResource() {
        return resource;
    }
}
