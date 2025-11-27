package lezione2;

public class RecipienteConTappo extends Recipiente {

    private boolean aperto;

    /**
     * Codstruttore
     * @param volume volume del recipiente
     * @param aperto indica se il tappo è aperto
     */
    public RecipienteConTappo(int volume, boolean aperto) {
        super(volume); //Recipiente(volume)
        this.aperto = aperto;
    }

    public RecipienteConTappo(int volume, int contenuto, boolean aperto) {
        super(volume, contenuto); //Recipiente(volume, contenuto)
        this.aperto = aperto;
    }

    public RecipienteConTappo(int volume) {
        super(volume); //Recipiente(volume)
        this.aperto = false;
    }

    public RecipienteConTappo(int volume, int contenuto) {
        super(volume, contenuto); //Recipiente(volume, contenuto)
        this.aperto = false;
    }

    @Override
    public void aggiungi(int quantita) {
        if (aperto) {
            contenuto = Math.min(volume, contenuto + quantita);
        } 
    }

    //Overload del metodo aggiungi per accettare float
    public void aggiungi(RecipienteConTappo r2) {
        if (!aperto || !r2.aperto) {
            return;
        }
        aggiungi(r2.getContenuto());
        r2.rimuovi(r2.getContenuto());
    }

    @Override
    public void rimuovi(int quantita) {
        if (aperto) {
            contenuto = Math.max(0, contenuto - quantita);
        }
    }

    public void apri() {
        this.aperto = true;
    }

    public void chiudi() {
        this.aperto = false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecipienteConTappo other = (RecipienteConTappo) obj;
        return volume == other.volume &&
               contenuto == other.contenuto &&
               aperto == other.aperto;
    }

    @Override
    public String toString() {
        return "RecipienteConTappo [id = "+ Integer.toHexString(System.identityHashCode(this)) + ", volume=" + volume + ", contenuto=" + contenuto + ", aperto=" + aperto + "]";
    }

}
