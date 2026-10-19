package 2026.lezione1;

public class Sound {
    

    private double maxRange;
    private double[] sound;
    private int elements;

    public Sound (int size, double maxRange){
        if (size < 1000 || maxRange <= 0 ) {
            throw new IllegalArgumentException("Errore");
        }
        this.maxRange = maxRange;
        this.sound = new double[size];
        this.elements = 0;
    }

    public int size() {
        return this.sound.length;
    }

    public int elements() {
        return this.elements;
    }

    public boolean put(double v) {
        if (v < -this.maxRange || v > this.maxRange){
            return false;
        }
        this.sound[elements] = v;
        this.elements++;
        return true;
    }

    public boolean put2(double v){
        if (v < -this.maxRange || v > this.maxRange){
            return false;
        }
        for (int i = 0; i < this.size(); i++){
            if (this.sound[i] == 0) {
                this.sound[i] = v;
                this.elements++;
                return true;
            }
        }
        return false;
    }

    public double get(int i){
        if (i < 0 || i >= this.elements){
            throw new IllegalArgumentException("ERRORE");
        }
        return this.sound[i];
    }

    public boolean isAPointOfinversion(int i){
        if (i < 0 || i >= this.elements){
            throw new IllegalArgumentException("ERRORE");
        }
        if (this.sound[i] >= 0 && this.sound[i+1] < 0){
            return true;
        }
        if (this.sound[i] <= 0 && this.sound[i+1] > 0){
            return true;
        }
        return false;
    }

    public int[] between(int from, int to) {
        int[] indici = new int[this.elements];
        int j = 0;
        for (int i = 0; i < this.elements; i++){
            if (this.sound[i] >= from && this.sound[i]<= to){
                indici[j] = i;
                j++;
            }
        }
        return indici;
    }

}
