package pattern.creational.factoryMethod.transport;

public class Ship implements Transport {
    private final long defaultPrice = 20;
    @Override
    public long deliver(long meter) {
        return meter;
    }
}
