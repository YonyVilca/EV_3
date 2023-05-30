package Singleton;
import java.util.Random;
public class Singleton {
    private static Singleton INSTANCE = null;
    private String frasedelDia;
    private Singleton() {
        frasedelDia = nuevaFrase();
    }
    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
    }
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }
    public String getfrasedelDia() {
        return frasedelDia;
    }
    private String nuevaFrase() {
        String[] frases = {
            "No juzgues cada dia por lo que cosechas, sino por las semillas que plantas.",
            "Cree en ti mismo y en lo que eres. Se consciente de que hay algo en tu interior que es mas grande que cualquier obstaculo.",
            "Lo que con mucho trabajo se adquiere, más se ama.",
        };
        Random random = new Random();
        int Dfrases = random.nextInt(frases.length);
        return frases[Dfrases];
    }
}
