package simone_unicam_1.lezione2;

public class Recipiente {

    private int volume;
    private int contenuto;
    private String stato; // "aperto" o "chiuso"

    public Recipiente(int quantita) {
        this.volume = quantita;
        this.contenuto = 0;
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
        if (stato.equals("aperto")) {
            contenuto = Math.min(volume, contenuto + quantita);
        }   
    }

    public void rimuovi(int quantita) {
        if (stato.equals("aperto")) {
            contenuto = Math.max(0, contenuto - quantita);
        }
    }

    public void apri() {
        stato = "aperto";
    }

    public void chiudi() {
        stato = "chiuso";
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
               contenuto == other.contenuto &&
               stato.equals(other.stato);
    }

    @Override
    public String toString() {
        return "Recipiente [id = "+ Integer.toHexString(System.identityHashCode(this)) + ", volume=" + volume + ", contenuto=" + contenuto + ", stato=" + stato + "]";
    }

    public void stampa() {
        System.out.println(this.toString());
    }

    
}
