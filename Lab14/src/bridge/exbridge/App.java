package bridge.exbridge;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        OperatingSystem windows = new windowsOS();
        OperatingSystem macOs = new MacOS();

        Computer laptop1 = new Laptop(windows);
        laptop1.startup();
        laptop1.browseIntemet("face.com");

        PC pc1 = new PC(macOs);
        pc1.startup();
        pc1.browseIntemet("youtube.com");
    }
}
