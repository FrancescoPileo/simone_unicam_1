package lezione1_4;

public class Sfera implements FiguraConRaggio, FiguraConColore {
    private double raggio;
    private String colore;

    public Sfera(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public double calcolaVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raggio, 3);
    }

    @Override
    public String toString() {
        return "Sfera [raggio=" + raggio + ", volume=" + calcolaVolume() + "]";
    }
}
