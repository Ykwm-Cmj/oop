package pattern.behavioral.observer.observerPattern;

public class Customer implements Observer {
    private String phoneNumber;
    private boolean interestedInNotifications;

    public Customer(String phoneNumber, boolean interestedInNotifications) {
        this.phoneNumber = phoneNumber;
        this.interestedInNotifications = interestedInNotifications;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setInterestedInNotifications(boolean interestedInNotifications) {
        this.interestedInNotifications = interestedInNotifications;
    }

    public boolean isInterestedInNotifications() {
        return interestedInNotifications;
    }

    @Override
    public void update(String message) {
        if (interestedInNotifications) {
            System.out.println("updating... >>Customer " + phoneNumber + " received notification: " + message);
        }
    }
}

