package bridge.exbridge;

public class MacOS implements OperatingSystem{
    @Override
    public void startup() {
        System.out.println("MacOS staring up!");
    }

    @Override
    public void loadUrl(String Url) {
        System.out.println("MacOS loading url!");
    }
}
