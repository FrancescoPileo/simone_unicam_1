package lezione15;

public class Coda {

    private Visita[] visite;
    private int nPazienti;

    public Coda(int nMax){
        if (nMax < 0) {
            throw new IllegalArgumentException("ERRORE");
        } 
        this.visite = new Visita[nMax];
        this.nPazienti = 0;
    }

    public boolean inserimento(Visita v){
        if (v == null || this.visite.length <= this.nPazienti){
            return false;
        }
        this.visite[this.visite.length - 1 - this.nPazienti] = v;
        this.nPazienti++;
        return true;
    }

    public Visita estazione(){
        if (this.nPazienti == 0){
            return null;
        }
        Visita temp = this.visite[this.visite.length - 1];
        int i;
        for (i = this.visite.length - 1; i > this.visite.length - this.nPazienti; i--){
            this.visite[i] =  this.visite[i-1];
        }
        this.visite[i] = null;
        this.nPazienti--;
        return temp;
    }

    public boolean cancella(String nome, String cognome){
        int i;
        boolean trovato =  false;
        for (i = 0; i < this.visite.length && trovato == false; i++){
            if (this.visite[i] != null &&
                this.visite[i].getNome().equals(nome) &&
                this.visite[i].getCognome().equals(cognome)){
                    this.visite[i] = null;
                    trovato = true;
                }
        }
        if (trovato==false){
            return false;
        }
        for (int j = i  - 1 ; j > 0 ; j--){
            this.visite[j] = this.visite[j - 1];
        }
        this.visite[0] = null;
        this.nPazienti--;
        return true;
    }

    @Override
    public String toString() {
        String stringa = "Coda{\n";
        for(int i=0; i<this.visite.length; i++){
            if (this.visite[i] == null){
                stringa+="   null\n";
            } else {
                stringa+="   " + this.visite[i].toString() + "\n";
            }
        }
        stringa+="}";
        return stringa;
    }


    
}
