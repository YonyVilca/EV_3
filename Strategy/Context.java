package Strategy;

/**
 * La clase Context proporciona un contexto para ejecutar una estrategia específica.
 * Utiliza una estrategia para ejecutar operaciones matemáticas.
 */
public class Context {
    private Strategy strategy;
    
    /**
     * Constructor de la clase Context.
     * @param strategy la estrategia a utilizar
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    /**
     * Ejecuta la estrategia para realizar una operación matemática.
     * @param num1 el primer número de la operación
     * @param num2 el segundo número de la operación
     * @return el resultado de la operación
     */
    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
