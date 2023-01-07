package bridge.exbridge;

public class windowsOS implements OperatingSystem{
    @Override
    public void startup() {
        System.out.println("Window staring up!");
    }

    @Override
    public void loadUrl(String Url) {
        System.out.println("Window loading url!");
    }
}
