public class Polinomio {

    private float[] coefficienti;

    public Polinomio(float[] coefficienti){
        this.coefficienti = coefficienti;
    }

    public Polinomio(int n) {
        if (n < 0) {
            throw new RuntimeException("Dimensione negativa");
        }
        this.coefficienti = new float[n];
    }

    @Override 
    public String toString(){
        String s = "[ ";
        for (int i = 0; i < this.coefficienti.length; i++) {
            s += this.coefficienti[i] + " ";
        }
        s+= "]";
        return s;
    }

    public int dimensione() {
        return this.coefficienti.length;
    }

    public float get(int i){
        if (i < 0) {
            throw new RuntimeException("Indice negativo");
        }
        if (i >= this.coefficienti.length) {
            return 0;
        }
        return this.coefficienti[i];
    }

    public void set(int i, float x){
        if (i < 0 || i >= this.coefficienti.length) {
            throw new RuntimeException("Indice non valido");
        }
        this.coefficienti[i] = x;
    }

    /**
     *   Polinomio somma(Polinomio that): calcola la somma
     *   tra this e that, ovvero il polinomio la cui
     *   dimensione è il massimo tra le dimensioni di this e that,
     *   e i cui coefficienti sono
     *   la somma dei coefficienti corrispondenti di this e that.
     */
    public Polinomio somma(Polinomio that){
        int dimensione = Math.max(this.dimensione(), that.dimensione());
        Polinomio risultato = new Polinomio(dimensione);

        for (int i = 0; i < dimensione; i++){
            risultato.set(i, this.get(i) + that.get(i));
        }

        return risultato;
    }

    /*
     * float valore(float x): valuta il polinomio,
     *     ovvero calcola la quantità:
     *     c0 * x^0 + c1 * x^1 + ... + c(n-1) * x^(n-1)
     *     dove [c0, ..., c(n-1)] sono i coefficienti del polinomio.
     *     Suggerimento: usare il metodo Math.pow
     *     per calcolare la potenza i-esima di x.
    */
    public float valore(float x){
        float risultato = 0;
        for (int i = 0; i < this.coefficienti.length; i++) {
            risultato += this.get(i) * Math.pow(x, i);
        }
        return risultato;
    }
    


    

}
