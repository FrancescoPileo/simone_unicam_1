package lezione2;

public class main {

    public static void main(String[] args) {
        //es1();
        es2();
        //es4();
        //es5();

    }

    static void es5() {
        Frazione f1 = new Frazione(1, 3);
        Frazione f2 = new Frazione(1, 2);
        Frazione somma = f1.somma(f2);
        System.out.println(f1 + " + " + f2 + " = " + somma);
        System.out.println(f1 + " > " + f2 + " = " + f1.compara(f2));
        somma.semplifica();
        System.out.println("Somma semplificata: " + somma);

    }

    static void es4() {
        Primes primi = new Primes();
        for (int i = 0; i < 10; i++) {
            System.out.print(primi.next() + " ");
        }
        System.out.println();
    }

    static void es1() {
        Orologio orologio = new Orologio(22, 15);
        orologio.tick();
        System.out.println("Ora: " + orologio.getOre() + ":" + orologio.getMinuti());
    }

    static void es2() {
        Recipiente r1 = new Recipiente(50);
        System.out.println("Recipiente r1: " + r1);
        riempiCompletamente(r1);
        System.out.println("Recipiente r1: " + r1);

        RecipienteConTappo r2 = new RecipienteConTappo(30);
        System.out.println("RecipienteConTappo r2: " + r2);
        r2.apri();
        riempiCompletamente(r2);
        System.out.println("RecipienteConTappo r2: " + r2);
    }

    private static void riempiCompletamente(Recipiente r) {
        r.aggiungi(r.getVolume());
    }

    static void stampaArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
}


