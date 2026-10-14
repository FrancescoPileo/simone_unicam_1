package lezione14;

public class SistemaSolare {

    private Pianeta[] pianeti;
    private int numero;

    public SistemaSolare(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Il numero di pianeti deve essere maggiore o uguale a zero");
        }
        this.pianeti = new Pianeta[n];
        this.numero = 0;
    }

    public boolean nuovo(Pianeta p){
        if (p == null || this.numero >= this.pianeti.length){
            return false;
        }
        int i = 0;
        while( i < this.numero && p.getDistanza() > this.pianeti[i].getDistanza()){
            i++;
        }
        for (int j = this.numero; j > i; j--){
            this.pianeti[j] = this.pianeti[j-1];
        }
        this.pianeti[i] = p;
        this.numero++;
        return true;
    }

    public  int getNumero(){
        return this.numero;
    }

    public Pianeta getPianeta(int n){
        if (n >= this.numero){
            return null;
        }
        return this.pianeti[n];
    }

    public Pianeta getMaxPianeta(){
        if (this.numero <= 0){
            return null;
        }
        Pianeta max = this.pianeti[0];
        for (int i = 1; i<this.numero; i++){
            if (this.pianeti[i].getMassa() > max.getMassa()){
                max = this.pianeti[i];
            }
        }
        return max;
    }

    public String toString(){
        String s = "Sistema Solare: \n";
        for (int i = 0; i<this.numero; i++){
            s += this.pianeti[i].toString() + "\n";
        }
        return s;
    }
    
}
