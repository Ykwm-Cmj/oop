package pattern.behavioral.observer.unusedObserver2;

public class Customer2 {
    private String phoneNumber;
    private boolean interestedInNewProduct;

    public Customer2(String phoneNumber, boolean interestedInNewProduct) {
        this.phoneNumber = phoneNumber;
        this.interestedInNewProduct = interestedInNewProduct;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isInterestedInNewProduct() {
        return interestedInNewProduct;
    }

    public void receiveNotification(String message) {
        System.out.println("Notification to " + phoneNumber + ": " + message);
        reaction();
    }

    // SMS전송 로직 추가
     public void sendSMS(String message) {
         System.out.println("SMS to " + phoneNumber + ": " + message);
         reaction();
     }

     public void reaction() {
         if(interestedInNewProduct){
             System.out.println(">>Thank you !! Good information");
         }else{
             System.out.println(">>Fucking spam mail");
         }
     }

    @Override
    public String toString() {
        return "Customer2{" +
               "phoneNumber='" + phoneNumber + '\'' +
               ", interestedInNotification=" + interestedInNewProduct+ '}';
    }
}
