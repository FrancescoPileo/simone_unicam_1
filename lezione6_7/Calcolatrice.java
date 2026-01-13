package lezione6_7;

public class Calcolatrice {

    private double n1;
    private double n2;

    private double somma;
    private double sottrazione;
    private double moltiplicazione;
    private double divisione;

    public Calcolatrice(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }


    public void calcolaSomma() {
        this.somma = n1 + n2;
    }

    public void calcolaSottrazione() {
        this.sottrazione = n1 - n2;
    }

    public void calcolaMoltiplicazione() {
        this.moltiplicazione = n1 * n2;
    }

    public void calcolaDivisione() {
        if (n2 == 0) {
            throw new ArithmeticException("Divisione per zero non consentita.");
        }
        this.divisione = n1 / n2;
    }

    public double getDivisione() {
        return divisione;
    }

    public double getMoltiplicazione() {
        return moltiplicazione;
    }

    public double getSomma() {
        return somma;
    }

    public double getSottrazione() {
        return sottrazione;
    }

    public double somma() {
        return n1 + n2;
    }

    public double sottrazione() {
        return n1 - n2;
    }

    public double moltiplicazione() {
        return n1 * n2;
    }

    public double divisione() {
        if (n2 == 0) {
            throw new ArithmeticException("Divisione per zero non consentita.");
        }
        return n1 / n2;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

}