class PaymentStrategy:
    """
    Clase base abstracta para las estrategias de pago.
    """

    def pay(self, amount):
        """
        Método abstracto para realizar el pago.

        Args:
            amount (float): Monto a pagar.
        """
        pass


class CreditCardPaymentStrategy(PaymentStrategy):
    """
    Implementación de la estrategia de pago con tarjeta de crédito.
    """

    def __init__(self, card_number):
        """
        Constructor que recibe el número de tarjeta de crédito.

        Args:
            card_number (str): Número de tarjeta de crédito.
        """
        self.card_number = card_number

    def pay(self, amount):
        """
        Realiza el pago con tarjeta de crédito.

        Args:
            amount (float): Monto a pagar.
        """
        print(f"Pago de S/.{amount} realizado con tarjeta de crédito: {self.card_number}")


class PayPalPaymentStrategy(PaymentStrategy):
    """
    Implementación de la estrategia de pago con PayPal.
    """

    def __init__(self, email):
        """
        Constructor que recibe el correo electrónico de PayPal.

        Args:
            email (str): Correo electrónico de PayPal.
        """
        self.email = email

    def pay(self, amount):
        """
        Realiza el pago con PayPal.

        Args:
            amount (float): Monto a pagar.
        """
        print(f"Pago de S/.{amount} hecho con cuenta PayPal: {self.email}")


class BitcoinPaymentStrategy(PaymentStrategy):
    """
    Implementación de la estrategia de pago con Bitcoin.
    """

    def __init__(self, bitcoin_address):
        """
        Constructor que recibe la dirección de Bitcoin.

        Args:
            bitcoin_address (str): Dirección de Bitcoin.
        """
        self.bitcoin_address = bitcoin_address

    def pay(self, amount):
        """
        Realiza el pago con Bitcoin.

        Args:
            amount (float): Monto a pagar.
        """
        print(f"Pago de S/.{amount} realizado con la dirección de Bitcoin: {self.bitcoin_address}")
