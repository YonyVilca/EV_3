package Strategy;
/**
 * La clase StrategyPatternDemo demuestra el uso del patrón de diseño Strategy.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        // Crear un contexto con la estrategia de suma y ejecutar la operación
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        // Cambiar la estrategia a multiplicación y ejecutar la operación
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        // Cambiar la estrategia a resta y ejecutar la operación
        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
    }
}