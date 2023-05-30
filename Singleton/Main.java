package Singleton;
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        String frasedelDia = singleton.getfrasedelDia();
        System.out.println("Frase del día: " + frasedelDia);
    }
}
