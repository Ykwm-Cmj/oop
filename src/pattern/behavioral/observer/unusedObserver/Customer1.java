package pattern.behavioral.observer.unusedObserver;
/**
 * 제품의 변경사항이 발생 시, 모든 고객에게 변경에 대한 알림을 보냈으나
 * 알림에 대하여 불필요하다고 느껴 불만을 제기하는 고객이 생김
 */
public class Customer1 {
    private String phoneNumber;
    private boolean interestedInNewProduct; // 제품에 대한 흥미 여부

    public Customer1(String phoneNumber, boolean interestedInNewProduct) {
        this.phoneNumber = phoneNumber;
        this.interestedInNewProduct = interestedInNewProduct;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean getInterested() {
        return interestedInNewProduct;
    }

    public void setInterestedInNewProduct(boolean interestedInNewProduct) {
        this.interestedInNewProduct = interestedInNewProduct;
    }


    public void receiveCall(String message) {
        System.out.println("Phone call to " + phoneNumber + ": " + message);
    }


    public void reaction() {
        if(interestedInNewProduct){
            System.out.println(">>Thank you !! Good information");
        }else{
            System.out.println(">>Fucking spam mail");
        }
    }
}
