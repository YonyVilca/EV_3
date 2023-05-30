package Strategy;

/**
 * La clase OperationSubstract implementa la interfaz Strategy y realiza la operación de resta.
 */
public class OperationSubstract implements Strategy {
    /**
     * Realiza la operación de resta.
     * @param num1 el primer número de la operación
     * @param num2 el segundo número de la operación
     * @return el resultado de la resta
     */
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
