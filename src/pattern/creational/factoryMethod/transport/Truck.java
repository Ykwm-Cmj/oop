package pattern.creational.factoryMethod.transport;

public class Truck implements Transport {
    private final long defaultPrice = 10;
    @Override
    public long deliver(long meter) {
        return meter * defaultPrice;
    }
}
