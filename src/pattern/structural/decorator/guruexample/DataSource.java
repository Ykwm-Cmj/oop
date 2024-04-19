package pattern.structural.decorator.guruexample;

public interface DataSource {
    void writeData(String data);

    String readData();
}