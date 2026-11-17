public class Main {

    /**
     * Esercizio 1: Cartella (File System Gerarchico)
     * 
     * Si vuole modellare un sistema semplificato di gestione di cartelle su disco. 
     * Ciascuna cartella è caratterizzata da una dimensione propria (in MB) espressa con un attributo di tipo double
     *  e può contenere altre sottocartelle (oggetti di tipo Cartella).
     * 
     * Definire la classe Cartella con i seguenti costruttori e metodi:
     * public Cartella(double dimensionePropria, int maxSottocartelle):
     *    crea una cartella vuota con la dimensione propria specificata (es. i file base al suo interno)
     *    e che può contenere al massimo maxSottocartelle cartelle figlie.
     *    Lancia un'eccezione di tipo IllegalArgumentException se dimensionePropria
     *    è negativa (< 0) oppure se maxSottocartelle è negativo (< 0).
     * public boolean aggiungiCartella(Cartella c):
     *    aggiunge la cartella c come sottocartella diretta dell'oggetto corrente.
     *    Se c è null oppure coincide con l'oggetto corrente (c == this), restituisce false.
     *    Se è già stato raggiunto il numero massimo di sottocartelle dirette, restituisce false;
     *    altrimenti inserisce c e restituisce true.
     * public int numeroSottocartelle():
     *    restituisce il numero di sottocartelle attualmente contenute nel livello immediatamente sottostante.
     * public double dimensioneTotale():
     *    calcola e restituisce ricorsivamente la somma della dimensione propria della
     *    cartella corrente e delle dimensioni totali di tutte le sottocartelle contenute a qualsiasi livello di profondità.
     * public int contaCartelleTotali():
     *    calcola e restituisce ricorsivamente il numero complessivo di cartelle presenti
     *    nell'intera gerarchia a partire dalla cartella corrente (inclusa se stessa).
     * Override public String toString():
     *    restituisce una stringa nel formato "<dimensioneTotale> (<numeroSottocartelle>)" (es. "125.5 (3)").
     * Vincolo: È vietato l'uso di classi della libreria standard di Java ad eccezione di Math,
     *    String e delle sottoclassi di Exception.
     * 
     */
    public static void main(String[] args) {
        
        Cartella a = new Cartella(3, 3);
        Cartella b1 = new Cartella(5, 2);
        Cartella b2 = new Cartella(7, 0);
        Cartella b3 = new Cartella(5, 3);
        Cartella d1 = new Cartella(5, 0);
        Cartella d2 = new Cartella(4, 0);
        Cartella d3 = new Cartella(1, 0);
        Cartella c1 = new Cartella(8, 0);
        Cartella c2 = new Cartella(2, 0);
        a.aggiungiCartella(b1);
        a.aggiungiCartella(b2);
        a.aggiungiCartella(b3);
        b1.aggiungiCartella(c1);
        b1.aggiungiCartella(c2);
        b3.aggiungiCartella(d1);
        b3.aggiungiCartella(d2);
        b3.aggiungiCartella(d3);

        System.out.println("A");
        System.out.println("Dimensione totale: " + a.dimensioneTotale());
        System.out.println("Cartelle totali: " + a.contaCartelleTotali());
        System.out.println(a);

        System.out.println("\nB3");
        System.out.println("Dimensione totale: " + b3.dimensioneTotale());
        System.out.println("Cartelle totali: " + b3.contaCartelleTotali());
        System.out.println(b3);

        System.out.println("\nC2");
        System.out.println("Dimensione totale: " + c2.dimensioneTotale());
        System.out.println("Cartelle totali: " + c2.contaCartelleTotali());
        System.out.println(c2);

    }
    
}
