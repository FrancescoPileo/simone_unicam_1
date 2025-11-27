package lezione2;

public class Orologio {

    private int ore;
    private int minuti;

    public Orologio(int ore, int minuti) {
        this.ore = ore;
        this.minuti = minuti;
    }

    public int getOre() {
        return ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public void tick() {
        minuti++; // minuti = minuti + 1; minuti += 1;
        if (minuti > 59) { 
            minuti = 0;
            ore++; //ore += 1; ore = ore + 1;
            if (ore > 23) {
                ore = 0;
            }
        }
    }
    
}
