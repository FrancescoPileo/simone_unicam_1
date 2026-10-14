package lezione5;

public class Chiodo extends Prodotto {
    double lunghezza;

    public Chiodo(double prezzo, int quantita, double lunghezza) {
        super(prezzo, quantita);
        this.lunghezza = lunghezza;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    @Override
    public String toString() {
        return "Chiodo [prezzo=" + prezzo + ", quantita=" + quantita + ", lunghezza=" + lunghezza + "]";
    }
}