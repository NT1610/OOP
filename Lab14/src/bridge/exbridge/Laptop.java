package bridge.exbridge;

public class Laptop extends Computer{

    public Laptop(OperatingSystem os){
        super(os);
    }
    @Override
    public void startup() {
        this.os.startup();
    }

    @Override
    public void browseIntemet(String url) {
        this.os.loadUrl(url);
        System.out.println("Laptop browse " + url);

    }

    @Override
    public boolean canMove() {
        return false;
    }
}
