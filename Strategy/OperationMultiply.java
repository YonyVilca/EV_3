package Strategy;

/**
 * La clase OperationMultiply implementa la interfaz Strategy y realiza la operación de multiplicación.
 */
public class OperationMultiply implements Strategy {
    /**
     * Realiza la operación de multiplicación.
     * num1 el primer número de la operación
     * num2 el segundo número de la operación
     * @return el resultado de la multiplicación
     */
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}