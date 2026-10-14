package lezione8;

public class main {
 
    public static void main(String[] args) {
        //incrementi();
        System.out.println(es1mod7(1));
    }

    static int somma(int a, int b) {
        return a + b;
    }

    static double dividi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisione per zero");
        }
        return (double)a / b;
    }

    static void stampaMessaggio(String msg) {
        if (msg == null || msg == "") {
            return;
        }
        System.out.println(msg);
    }

    static void chiamaDivisione(int a, int b) {
        double risultato = dividi(a, b);
        System.out.println("Risultato: " + risultato);
    }

    static void chiamaStampaMessaggio(String msg) {
        stampaMessaggio(msg);
        System.out.println("Messaggio stampato con successo.");
    }

    static String pariODispari(int numero) {
        if (numero % 2 == 0) {
            return "pari";
        }
        return "dispari";
    }

    static void foo() {
        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println("Iterazione: " + i);
        }
        for (i = 5; i < 10; i++){
            System.out.println("Iterazione2: " + i);
        };
        System.out.println(i);
    }

    static void incrementi(){
        int i = 0;
        System.out.println(i++); //prima stampa dopo incrementa
        System.out.println(i);
        System.out.println(++i); //prima incrementa dopo stampa
        // i = i + 1 <==> ++i
        System.out.println(i = i + 1);
        // i = i - 1 <==> --i
        System.out.println(i = i - 1);
    }

    static void testIncrementi(){
        int x = 1, y = 5; // x == 1, y == 5
        System.out.println(x + ", " + y); // x == 1, y == 5, stampa 1, 5
        x++; // x == 2, y == 5
        y--; // x == 2, y == 4
        System.out.println((x++) + ", " + y); // x == 3, y == 4, stampa 2, 4
        System.out.println((++x) + ", " + y); // x == 4, y == 4, stampa 4, 4
        System.out.println(x + ", " + (y--)); // x == 4, y == 3, stampa 4, 4
        System.out.println(x + ", " + (--y)); // x == 4, y == 2, stampa 4, 2
        ++x; // x == 5, y == 2
        --y; // x == 5, y == 1
        System.out.println(x + ", " + y); // x == 5, y == 1, stampa 5, 1

    }

    static int es1mod7(int n) {
        return n = ++n;
    }

}
