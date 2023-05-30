package Strategy2;
// Implementación de la estrategia de pago con tarjeta de crédito
class CreditCardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;

    // Constructor que recibe el número de tarjeta de crédito
    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Método para realizar el pago con tarjeta de crédito
    public void pay(double amount) {
        System.out.println("Pago de S/." + amount + " realizado con tarjeta de crédito: " + cardNumber);
    }
}