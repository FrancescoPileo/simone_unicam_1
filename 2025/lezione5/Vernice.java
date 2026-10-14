package lezione5;

public class Vernice extends Prodotto {
    String colore;
    double litri;

    public Vernice(double prezzo, int quantita, String colore, double litri) {
        super(prezzo, quantita);
        this.colore = colore;
        this.litri = litri;
    }

    public String getColore() {
        return colore;
    }

    public double getLitri() {
        return litri;
    }

    public void colora(){}


    @Override
    public String toString() {
        return "Vernice [prezzo=" + prezzo + ", quantita=" + quantita + ", colore=" + colore + ", litri=" + litri + "]";
    }  
    
}
