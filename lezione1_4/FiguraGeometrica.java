package lezione1_4;

public abstract class FiguraGeometrica {

    private String nome;
    private int nLati;
    protected String colore;

    protected String ciao = "Ciao";

    public FiguraGeometrica(String nome, int nLati) {
        this.nome = nome;
        this.nLati = nLati;
    }

    public String getNome() {
        return nome;
    }

    public int getnLati() {
        return nLati;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public abstract double getArea();

    public void setnLati(int lati) {
        this.nLati = lati;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica [nome=" + nome + ", nLati=" + nLati + ", area=" + getArea() + ", colore=" + colore + "]";
    }
      

    
}
