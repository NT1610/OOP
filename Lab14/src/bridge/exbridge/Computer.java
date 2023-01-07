package bridge.exbridge;

public abstract class Computer {
    protected OperatingSystem os;

    public Computer(OperatingSystem os){
        this.os = os;
    }
    public abstract void startup();
    public abstract void browseIntemet(String url);
    public abstract boolean canMove();

}
