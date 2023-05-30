package Strategy2;

// Interfaz que define el contrato para las estrategias de pago
interface PaymentStrategy {
    void pay(double amount);
}