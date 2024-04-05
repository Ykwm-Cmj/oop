package pattern.structural.adapter.phone;

public class OldPhone implements Phone {
    private String myPhoneNumber;

    public OldPhone(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }

    @Override
    public void call(String phoneNum) {
        System.out.println(myPhoneNumber + " called to " + phoneNum);
    }

    @Override
    public void sandMasage(String toNumber, String masage) {
        System.out.println(myPhoneNumber + " sand masage to " + toNumber + "\n" + masage);
    }
}
