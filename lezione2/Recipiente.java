package lezione2;

public class Recipiente {

    protected int volume;
    protected int contenuto;

    public Recipiente(int volume) {
        this.volume = volume;
        this.contenuto = 0;
    }

    public Recipiente(int volume, int contenuto) {
        this.volume = volume;
        this.contenuto = Math.min(volume, Math.max(0, contenuto));
    }

    public int getVolume() {
        return volume;
    }

    public int getContenuto() {
        return contenuto;
    }

    public int capacita() {
        return volume - contenuto;
    }

    public void aggiungi(int quantita) {
        contenuto = Math.min(volume, contenuto + quantita);
    }

    public void rimuovi(int quantita) {
        contenuto = Math.max(0, contenuto - quantita);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Recipiente other = (Recipiente) obj;
        return volume == other.volume &&
               contenuto == other.contenuto;
    }

    @Override
    public String toString() {
        return "Recipiente [id = "+ Integer.toHexString(System.identityHashCode(this)) + ", volume=" + volume + ", contenuto=" + contenuto + "]";
    }

    public void unisci(Recipiente r2) {
        int spazioDisponibile = this.capacita();
        int daTrasferire = Math.min(spazioDisponibile, r2.getContenuto());
        this.aggiungi(daTrasferire);
        r2.rimuovi(daTrasferire);
    }

    
    
}
