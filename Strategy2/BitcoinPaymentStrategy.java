package Strategy2;
// Implementación de la estrategia de pago con Bitcoin
class BitcoinPaymentStrategy implements PaymentStrategy {
    private String bitcoinAddress;

    // Constructor que recibe la dirección de Bitcoin
    public BitcoinPaymentStrategy(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    // Método para realizar el pago con Bitcoin
    public void pay(double amount) {
        System.out.println("Pago de S/." + amount + " realizado con la dirección de Bitcoin: " + bitcoinAddress);
    }
}