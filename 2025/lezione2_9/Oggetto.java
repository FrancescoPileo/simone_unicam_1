package lezione2_9;

public class Oggetto {

    public int valore;

    public Oggetto(int valore) {
        this.valore = valore;
    }

    public void incrementa() {
        this.valore = this.valore + 1;
    }

    public static void incrementa(Oggetto obj) {
        obj.valore = obj.valore + 1;
    }

    public final static double pi = 3.14;

    public static double areaCerchio(double raggio) {
        return pi * raggio * raggio;
    }

}