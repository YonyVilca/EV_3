package Strategy2;

import java.util.Scanner;
/*
* Class : Strategy.java
* Description : Demostrando el patron de diseño Strategy.
* Author :  Yony Alex Vilca Mamani
* Fecha : 27-mayo-2023 10:00 a.m.
* Course : Lenguajes de Programación III
* Editor : VS CODE
*/

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione un método de pago: ");
        System.out.println("1. Tarjeta de crédito");
        System.out.println("2. PayPal");
        System.out.println("3. Bitcoin");

        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the new line character

        PaymentStrategy paymentStrategy;

        switch (option) {
            case 1:
                System.out.println("Ingrese el número de tarjeta de crédito: ");
                String cardNumber = scanner.nextLine();
                paymentStrategy = new CreditCardPaymentStrategy(cardNumber);
                break;
            case 2:
                System.out.println("Ingrese el correo electrónico de PayPal: ");
                String email = scanner.nextLine();
                paymentStrategy = new PayPalPaymentStrategy(email);
                break;
            case 3:
                System.out.println("Ingrese la dirección de Bitcoin: ");
                String bitcoinAddress = scanner.nextLine();
                paymentStrategy = new BitcoinPaymentStrategy(bitcoinAddress);
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        paymentContext.setPaymentStrategy(paymentStrategy);

        System.out.println("Ingrese el monto a pagar: ");
        double amount = scanner.nextDouble();
        paymentContext.performPayment(amount);
    }
}