public class Cartella {


    private double dimensionePropria;
    private Cartella [] sottocartelle;
    private int elements;

    /* public Cartella(double dimensionePropria, int maxSottocartelle):
     *    crea una cartella vuota con la dimensione propria specificata (es. i file base al suo interno)
     *    e che può contenere al massimo maxSottocartelle cartelle figlie.
     *    Lancia un'eccezione di tipo IllegalArgumentException se dimensionePropria
     *    è negativa (< 0) oppure se maxSottocartelle è negativo (< 0).    
    */
    public Cartella(double dimensionePropria, int maxSottocartelle){
        if (dimensionePropria < 0 || maxSottocartelle < 0) {
            throw new IllegalArgumentException("Argomenti non validi");
        }
        this.dimensionePropria = dimensionePropria;
        this.sottocartelle = new Cartella[maxSottocartelle];
        this.elements = 0;
    }

    /**
     * public boolean aggiungiCartella(Cartella c):
     *    aggiunge la cartella c come sottocartella diretta dell'oggetto corrente.
     *    Se c è null oppure coincide con l'oggetto corrente (c == this), restituisce false.
     *    Se è già stato raggiunto il numero massimo di sottocartelle dirette, restituisce false;
     *    altrimenti inserisce c e restituisce true.
     */
    public boolean aggiungiCartella(Cartella c) {
        if (c == null || c == this) {
            return false;
        }
        if (this.elements >= this.sottocartelle.length) {
            return false;
        }
        this.sottocartelle[this.elements] = c;
        this.elements++;
        return true;
    }

    /*
    public int numeroSottocartelle():
     *    restituisce il numero di sottocartelle attualmente contenute nel livello
     *    immediatamente sottostante.
    */
    public int numeroSottocartelle(){
        return this.elements;
    }

    /**
     * public double dimensioneTotale():
     *    calcola e restituisce ricorsivamente la somma della dimensione propria della
     *    cartella corrente e delle dimensioni totali di tutte le sottocartelle contenute
     *    a qualsiasi livello di profondità.
     */
    public double dimensioneTotale(){
        double totale = this.dimensionePropria;

        for (int i = 0; i < this.elements; i++){
            totale += this.sottocartelle[i].dimensioneTotale();
        }

        return totale;
    }

    /**
     * public int contaCartelleTotali():
     *    calcola e restituisce ricorsivamente il numero complessivo di cartelle presenti
     *    nell'intera gerarchia a partire dalla cartella corrente (inclusa se stessa).
     */
    public int contaCartelleTotali() {
        int totale = 1;

        for (int i = 0; i < this.elements; i++){
            totale += this.sottocartelle[i].contaCartelleTotali();
        }

        return totale;

    }

    /** 
     * Override 
     * public String toString():
     * restituisce una stringa nel formato "<dimensioneTotale> (<numeroSottocartelle>)" (es. "125.5 (3)").
     */
    public String toString(){
        return this.dimensioneTotale() + " (" + this.elements + ")";
    }
}
