package lezione10;

public abstract class Astratta {

    protected int valore;

    public Astratta(int valore) {
        this.valore = valore;
    }

    public abstract void triplicaValore();

    public abstract void raddoppiaValore();
}
