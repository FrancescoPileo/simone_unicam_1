import java.util.Arrays;

/**
     * Vogliamo progettare una classe in Java chiamata ThermalAnalyzer
     * che memorizza e analizza una sequenza di temperature registrate da un sensore.
     *Ecco cosa deve fare la classe:
     *
     *Campi privati:
     *Un array di interi int[] temperatures per memorizzare le temperature.
     *
     Un intero int count che tiene traccia del numero effettivo
     di temperature attualmente inserite.
     *
     *Costruttore:
     *
     *ThermalAnalyzer(int capacity): Costruisce un analizzatore
     * con una capacità massima definita da capacity.
     *
     *Controllo difensivo: Se la capacità è inferiore a 10,
     *deve lanciare un'eccezione di tipo IllegalArgumentException.
     *All'inizio il conteggio degli elementi inseriti è 0.
     *
     *Metodi da implementare:
     *
     *public boolean addTemperature(int temp):
     * Aggiunge la temperatura temp nella prima posizione disponibile dell'array
     * e restituisce true.
     * Se l'array è già pieno (cioè count ha raggiunto la capacità massima),
     * il valore non viene aggiunto e il metodo restituisce false.
     *
     *public double average(): Calcola e restituisce la media aritmetica delle temperature attualmente
     *memorizzate (attenzione ai tipi numerici quando dividi!).
     *Se non ci sono temperature memorizzate (count == 0),
     *deve lanciare un'eccezione di tipo IllegalStateException.
     *
     *public int[] findPeaks(): Produce e restituisce
     * un nuovo array contenente gli indici in cui si verifica un "picco termico".
     * Un indice i è considerato un picco se il valore in quella posizione
     * è strettamente maggiore del valore precedente e del valore successivo.
     *    (Nota: il primo e l'ultimo elemento dell'array attivo non possono mai essere considerati picchi,
     *    perché manca rispettivamente il precedente o il successivo).*/
public class Main {

    public static void main(String[] args) {

        ThermalAnalyzer ta = new ThermalAnalyzer(11);
        int[] temperatures = {18, 20};
        for (int temperature : temperatures) {
            ta.addTemperature(temperature);
        };
        int[] peaks = ta.findPeaks();
        System.out.println("Indici dei picchi: " + Arrays.toString(peaks));
    }



}