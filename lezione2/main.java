package simone_unicam_1.lezione2;

public class main {

    public static void main(String[] args) {
        //es1();
        //es2();
        //es4();
        es5();

    }

    static void es5() {
        Frazione f1 = new Frazione(1, 2);
        Frazione f2 = new Frazione(1, 4);
        Frazione somma = f1.somma(f2);
        System.out.println(f1 + " + " + f2 + " = " + somma);
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
        Recipiente recipiente = new Recipiente(100);
        recipiente.apri();
        recipiente.aggiungi(50);
        recipiente.rimuovi(20);
        recipiente.chiudi();
        recipiente.stampa();
       
        Recipiente recipiente2 = new Recipiente(100);
        recipiente2.apri();
        recipiente2.aggiungi(40);
        recipiente2.chiudi();
        recipiente2.stampa();

        System.out.println(recipiente);
    }

    static void stampaArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
}


