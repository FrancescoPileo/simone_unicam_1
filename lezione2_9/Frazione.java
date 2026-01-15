package lezione2_9;

public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore) throws IllegalArgumentException {
        if (denominatore == 0) {
            throw new IllegalArgumentException("Denominatore non può essere zero.");
        }
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    // 1/2 + 1/3 = (1*3 + 1*2) / (2*3) = 5/6
    public Frazione somma(Frazione f2) {
        int nuovoNumeratore = this.numeratore * f2.denominatore + f2.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * f2.denominatore;
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    public double valore() throws ArithmeticException {
        if (denominatore == 0) {
            throw new ArithmeticException("Denominatore non può essere zero.");
        }
        return (double) this.numeratore / this.denominatore;
    }

    public int compara(Frazione f2){
        if (this.valore() > f2.valore()){
            return 1;
        } else if (this.valore() < f2.valore()){
            return -1;
        } else {
            return 0;
        }
    }

    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

    public void semplifica() {
        int mcd = mcd(this.numeratore, this.denominatore);
        numeratore = numeratore / mcd;
        denominatore = denominatore / mcd;
    }

    public String toString() {
        if (this.denominatore == 1){
            return Integer.toString(this.numeratore);
        }
        return this.numeratore + "/" + this.denominatore;
    }


}
