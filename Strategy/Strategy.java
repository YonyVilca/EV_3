package Strategy;
/*
* Class : Strategy.java
* Description : Demostrando el patron de diseño Strategy.
* Author :  Yony Alex Vilca Mamani
* Fecha : 27-mayo-2023 10:00 a.m.
* Course : Lenguajes de Programación III
* Editor : VS CODE
/**
 * 
 * La interfaz Strategy define la operación matemática que debe ser implementada por las estrategias concretas.
 */
public interface Strategy {
    /**
     * Realiza una operación matemática.
     * @param num1 el primer número de la operación
     * @param num2 el segundo número de la operación
     * @return el resultado de la operación
     */
    public int doOperation(int num1, int num2);
}