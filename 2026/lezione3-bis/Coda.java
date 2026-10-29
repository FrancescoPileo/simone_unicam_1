package 2026.lezione3-bis;

public class Coda {
    /**
     - Definire la classe Coda che permette di inserire oggetti di tipo Visita.

     - La classe Coda è caratterizzata da un attributo coda di tipo array di Visita

     - e da un intero indicante il numero di prenotazioni.

     - Il costruttore di Coda ha un parametro intero indicante

     - il numero massimo di prenotazioni che possono essere gestite.

     - Tale costruttore lancia un'eccezione runtime se il parametro è negativo.

     - Definire quindi i seguenti metodi di Coda:

     *
     - boolean inserimento(Visita v) che inserisce una prenotazione

     - in fondo alla coda e restituisce true se ha successo.

     - Il metodo non effettua alcuna prenotazione

     - e restituisce false se il numero massimo di prenotazioni è stato raggiunto.

     *
     - Visita estrazione() che preleva e cancella la prima prenotazione della coda.

     - Il metodo restituisce null se la coda è vuota.

     *
     - boolean cancellazione(String nome, String cognome)

     - che cancella la prenotazione del paziente nome, cognome.

     *
     - int getNumero() che restituisce il numero di prenotazioni nella coda.

     *
     - Notare che i metodi estrazione e cancella devono mantenere

     - l'ordine delle prenotazioni che rimangono nella coda,

     - compattando opportunamente gli elementi dell'array coda.

     - Se utile, è possibile definire metodi ausiliari (privati) della classe Coda.

     */
    private Visita [] coda;
    private int prenotazioni;

    public Coda(int n) throws IllegalArgumentException {
        if(n < 0){
            throw new IllegalArgumentException();
        }
        this.coda = new Visita[n];
        this.prenotazioni = 0;
    }
    /**
     - boolean inserimento(Visita v) che inserisce una prenotazione

     -      * in fondo alla coda e restituisce true se ha successo.

     -      * Il metodo non effettua alcuna prenotazione

     -      * e restituisce false se il numero massimo di prenotazioni è stato raggiunto.

     */
    public boolean inserimento(Visita v){
        // CORRETTO: usiamo >= per evitare l'ArrayIndexOutOfBoundsException quando la coda è piena
        if(v == null || this.prenotazioni >= this.coda.length){
            return false;
        }
        this.coda[this.prenotazioni] = v;
        this.prenotazioni++;
        return true;
    }
    /**
     -  - Visita estrazione() che preleva e cancella la prima prenotazione della coda.

     -      * Il metodo restituisce null se la coda è vuota.

     - */

    public Visita estrazione(){
        if(this.prenotazioni == 0 ){
            return null;

        }
        Visita v = this.coda[0];

        // CORRETTO: partiamo da i = 0 e arriviamo fino a prenotazioni - 1 per compattare correttamente a sinistra
        for(int i = 0; i < this.prenotazioni - 1; i++){
            this.coda[i] = this.coda[i+1];
        }
        this.coda[this.prenotazioni-1] = null;
        this.prenotazioni--;
        return v;
    }

     /**
     - boolean cancellazione(String nome, String cognome)

     -      * che cancella la prenotazione del paziente nome, cognome.

     -      *

     - */
    public boolean cancellazione(String nome, String cognome){
        if(this.prenotazioni == 0){
            return false;
        }
        int posizioneTrovato = -1;
        for(int i = 0; i < this.prenotazioni; i++){
            if(coda[i].getNome().equals(nome) && coda[i].getCognome().equals(cognome)){
                posizioneTrovato = i;
                break;
            }
        }

        if (posizioneTrovato = -1) {
            return false
        }

        for(int i = posizioneTrovato; i < this.prenotazioni - 1; i++){
            this.coda[i] = this.coda[i+1];
        }
        this.coda[this.prenotazioni-1] = null;
        this.prenotazioni--;
        return true;

    }



    /** int getNumero() che restituisce il numero di prenotazioni nella coda.
     - */

    public int getNumero(){
        return this.prenotazioni;
    }

}