class PaymentContext:
    """
    Contexto de pago que utiliza una estrategia de pago determinada.
    """

    def __init__(self, payment_strategy):
        """
        Constructor que establece la estrategia de pago.

        Args:
            payment_strategy (PaymentStrategy): Estrategia de pago.
        """
        self.payment_strategy = payment_strategy

    def perform_payment(self, amount):
        """
        Realiza el pago utilizando la estrategia seleccionada.

        Args:
            amount (float): Monto a pagar.
        """
        self.payment_strategy.pay(amount)
