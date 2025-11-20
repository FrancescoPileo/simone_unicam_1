package simone_unicam_1.lezione2;

public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }
    

    // 1/2 + 1/3 = (1*3 + 1*2) / (2*3) = 5/6
    public Frazione somma(Frazione f2) {
        int nuovoNumeratore = this.numeratore * f2.denominatore + f2.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * f2.denominatore;
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }
}
