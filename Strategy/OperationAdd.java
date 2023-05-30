package Strategy;

/**
 * La clase OperationAdd implementa la interfaz Strategy y realiza la operación de suma.
 */
public class OperationAdd implements Strategy {
    /**
     * Realiza la operación de suma.
     * @param num1 el primer número de la operación
     * @param num2 el segundo número de la operación
     * @return el resultado de la suma
     */
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
