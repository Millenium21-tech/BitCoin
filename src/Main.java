

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();
        System.out.println("Attempting payment with Credit Card:");
        paymentProcessor.processPayment(creditCard);
        System.out.println("Attempting payment with Paypal:");
        paymentProcessor.processPayment(payPal);
        Bitcoin bitcoin = new Bitcoin();
        System.out.println("Attempting payment with Bitcoin:");
        paymentProcessor.processPayment(bitcoin);
    }
}
