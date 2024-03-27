package pattern.creational.factoryMethod.transport;

public interface Transport {
    long defaultPrice = 1;
    long deliver(long meter);

    static Transport getInstance(String roadType){
        return switch (roadType){
            case "GROUND" -> new Truck();
            case "SEA" -> new Ship();
            default -> throw new RuntimeException("No Declare roadType");
        };
    }
}
