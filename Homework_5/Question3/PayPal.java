package Question3;

public class PayPal implements PaymentStrategy{
    String email;

    public PayPal(String email){
        this.email = email;
    }
    @Override
    public void pay(int pay) {
        System.out.println("PayPay : $ " + pay);
    }
}
