package Strategy2;

// Implementación de la estrategia de pago con PayPal
class PayPalPaymentStrategy implements PaymentStrategy {
    private String email;

    // Constructor que recibe el correo electrónico de PayPal
    public PayPalPaymentStrategy(String email) {
        this.email = email;
    }

    // Método para realizar el pago con PayPal
    public void pay(double amount) {
        System.out.println("Pago de S/." + amount + " hecho con cuenta PayPal:" + email);
    }
}