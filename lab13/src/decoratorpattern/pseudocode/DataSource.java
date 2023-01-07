package decoratorpattern.pseudocode;

public interface DataSource {
    void writeData(String data);

    String readData();
}