from payment_strategy import *
from payment_context import *

"""
* Class : Strategy.java
* Description : Demostrando el patron de diseño Strategy.
* Author :  Yony Alex Vilca Mamani
* Fecha : 27-mayo-2023 10:00 a.m.
* Course : Lenguajes de Programación III
* Editor : VS CODE
"""

if __name__ == '__main__':
    payment_context = PaymentContext(None)

    print("Seleccione un método de pago: ")
    print("1. Tarjeta de crédito")
    print("2. PayPal")
    print("3. Bitcoin")

    option = int(input())

    if option == 1:
        card_number = input("Ingrese el número de tarjeta de crédito: ")
        payment_strategy = CreditCardPaymentStrategy(card_number)
    elif option == 2:
        email = input("Ingrese el correo electrónico de PayPal: ")
        payment_strategy = PayPalPaymentStrategy(email)
    elif option == 3:
        bitcoin_address = input("Ingrese la dirección de Bitcoin: ")
        payment_strategy = BitcoinPaymentStrategy(bitcoin_address)
    else:
        print("Opción inválida.")
        exit()

    payment_context.payment_strategy = payment_strategy

    amount = float(input("Ingrese el monto a pagar: "))
    payment_context.perform_payment(amount)
