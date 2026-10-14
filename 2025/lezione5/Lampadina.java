package lezione5;

public class Lampadina extends Prodotto {

    double wattaggio;

    public Lampadina(double prezzo, int quantita, double wattaggio) {
        super(prezzo, quantita);
        this.wattaggio = wattaggio;
    }

    public double getWattaggio() {
        return wattaggio;
    }

    @Override
    public String toString() {
        return "Lampadina [prezzo=" + prezzo + ", quantita=" + quantita + ", wattaggio=" + wattaggio + "]";
    }
    
}
