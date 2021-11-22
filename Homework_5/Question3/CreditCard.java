package Question3;

public class CreditCard implements PaymentStrategy{
    String cardNumber;

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int pay) {
        System.out.println("CreditCard : $" + pay);
    }
}
