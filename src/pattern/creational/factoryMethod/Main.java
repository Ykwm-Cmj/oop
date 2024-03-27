package pattern.creational.factoryMethod;

import pattern.creational.factoryMethod.transport.Transport;

public class Main {
    public static void main(String[] args) {
        String roadType = "SEA";
        long meter = 3000;
        Transport transport = Transport.getInstance(roadType);
        long pay = transport.deliver(meter);

        System.out.println("****************************");
        System.out.printf("%s road pay %s for deliver\n", roadType, pay);
        System.out.println("****************************");
    }
}
