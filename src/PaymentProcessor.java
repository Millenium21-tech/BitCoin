

public class PaymentProcessor {
    public PaymentProcessor() {
    }

    public void processPayment(CreditCard card) {
        System.out.println("Processing Credit Card Payment");
    }

    public void processPayment(PayPal paypal) {
        System.out.println("Processing PayPal Payment");
    }

    public void processPayment(Bitcoin bitCoin) {
        System.out.println("Processing Bitcoin Payment");
    }
}
