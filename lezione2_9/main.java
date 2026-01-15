package lezione2_9;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //es1();
        //es2();
        //es4();
        //es5();
        es6();

    }

    static void es5() {
        /*Frazione f1 = new Frazione(1, 3);
        Frazione f2 = new Frazione(1, 2);
        Frazione somma = f1.somma(f2);
        System.out.println(f1 + " + " + f2 + " = " + somma);
        System.out.println(f1 + " > " + f2 + " = " + f1.compara(f2));
        somma.semplifica();
        System.out.println("Somma semplificata: " + somma);*/
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        do {
            System.out.println("Inserisci numeratore:");
            int numeratore = scanner.nextInt();
            System.out.println("Inserisci denominatore:");
            int denominatore = scanner.nextInt();
            try {
                Frazione f1 = new Frazione(numeratore, denominatore);
                System.out.println("Frazione creata: " + f1.valore());
                validInput = true;
             } catch (Exception e) {
                System.out.println("Errore: " + e.getClass() + " - " + e.getMessage());
                validInput = false;
            }
            finally {
                System.out.println("Esecuzione del blocco finally.");
            }
        } while (!validInput);
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

    static void es6() {
        //i tipi primtivi sono passati per valore
        int a = 5;
        incrementa(a);
        System.out.println("Valore di a dopo la chiamata a incrementa: " + a);

        // gli array sono passati per riferimento
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Array prima della chiamata a incrementaArray:");
        stampaArray(arr);
        incrementaArray(arr);
        System.out.println("Array dopo la chiamata a incrementaArray:");
        stampaArray(arr);

        // gli oggetti sono passati per riferimento
        Oggetto obj = new Oggetto(10);
        System.out.println("Valore di obj.valore prima della chiamata a incrementa: " + obj.valore);
        incrementa(obj);
        System.out.println("Valore di obj.valore dopo la chiamata a incrementa: " + obj.valore);

    }

    static void incrementa(Integer a) {
        a = a + 1;
    }

    static void incrementaArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }

    static void stampaArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void incrementa(Oggetto obj) {
        obj.valore = obj.valore + 1;
    }
    
}