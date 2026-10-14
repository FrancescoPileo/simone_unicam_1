package lezione5;

public abstract class Prodotto {

    protected double prezzo;
    protected int quantita;

    public Prodotto(double prezzo, int quantita) {
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    /**
     * Carica una certa quantita' di prodotto
     * @param quantita intero positivo
     */
    public void caricamento(int quantita) {
        if (quantita < 0) {
            throw new IllegalArgumentException("La quantita' da caricare deve essere positiva");
        }
        this.quantita += quantita;
    }

    public boolean vendita(int quantita) {
        if (quantita <= this.quantita) {
            this.quantita -= quantita;
            return true;
        } else {
            return false;
        }
    }

    public abstract String toString();

}
