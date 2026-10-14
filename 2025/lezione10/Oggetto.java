package lezione10;

public class Oggetto extends Astratta implements Interfaccia, Interfaccia2 {

    public Oggetto() {
        super(10);
    }
    
    @Override
    public void raddoppiaValore() {
        super.valore *= 2;
    }

    @Override
    public void triplicaValore() {
        super.valore *= 3;
    }

    public int calcolaValore() {
        return super.valore;
    }

    public void quadruplicaValore() {
        super.valore *= 4;
    }
}