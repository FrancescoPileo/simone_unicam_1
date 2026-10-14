package lezione14;

public class Pianeta {
    
    private String nome;
    private double massa;
    private double distanza;

    public Pianeta(String nome, double massa, double distanza) {
        if (nome == null) {
            throw new IllegalArgumentException("Il nome del pianeta non può essere null");
        }
        if (massa < 0) {
            throw new IllegalArgumentException("La massa del pianeta deve essere maggiore di zero");
        }
        if (distanza < 0) {
            throw new IllegalArgumentException("La distanza del pianeta deve essere maggiore di zero");
        }
        this.nome = nome;
        this.massa = massa;
        this.distanza = distanza;
    }

    public String getNome() {
        return nome;
    }

    public double getMassa() {
        return massa;
    }

    public double getDistanza() {
        return distanza;
    }

    public String toString() {
        return "Pianeta: " + nome + ", Massa: " + massa + " kg, Distanza: " + distanza + " km";
    }

    
    
}
