package Strategy2;

// Contexto de pago que utiliza una estrategia de pago determinada
class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Establece la estrategia de pago
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Realiza el pago utilizando la estrategia seleccionada
    public void performPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}