package bridge.exbridge;

public class PC extends Computer{
    public PC(OperatingSystem os){
        super(os);
    }
    @Override
    public void startup() {
        this.os.startup();
    }

    @Override
    public void browseIntemet(String url) {
        this.os.loadUrl(url);
        System.out.println("PC browse " + url);

    }

    @Override
    public boolean canMove() {
        return false;
    }
}
