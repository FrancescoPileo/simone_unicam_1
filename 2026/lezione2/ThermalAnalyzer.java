
public class ThermalAnalyzer {
    
    private int[] temperatures;
    private int count;

    public ThermalAnalyzer(int capacity){
        if (capacity<10) {
            throw new IllegalArgumentException();
        }
        this.temperatures = new int[capacity];
        this.count = 0;
    }

    //se la temperatura è minore di -1000 o maggiore di 1000 errore IllegalArg...
    public boolean addTemperature(int t){
        if (t < -1000 || t > 1000){
            throw new IllegalArgumentException();
        }
        if (this.count >= temperatures.length){
            return false;
        }
        this.temperatures[this.count] = t;
        this.count++;
        return true;
    }

    public double average(){
        if (this.count == 0){
            throw new IllegalStateException();
        }
        double somma = 0;
        for (int i = 0; i < this.count; i++){
            somma += this.temperatures[i];
        }
        return somma / this.count; 
    }

    public int[] findPeaks(){
        int conta = 0;
        for (int i = 1; i < this.count - 1; i++){
            if (this.temperatures[i] > this.temperatures[i-1] &&
                this.temperatures[i] > this.temperatures[i+1]
            ){
                conta++;
            }
        }
        int[] risultato = new int[conta];
        int index = 0;
        for (int i = 1; i < this.count - 1; i++){
            if (this.temperatures[i] > this.temperatures[i-1] &&
                this.temperatures[i] > this.temperatures[i+1]
            ){
                risultato[index++] = i;
            }
        }
        return risultato;
    }

    

}
