package pattern.structural.decorator.guruexample.deco;

import pattern.structural.decorator.guruexample.DataSource;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        System.out.println("DataSourceDecorator write");
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("DataSourceDecorator read");
        return wrappee.readData();
    }
}