package simone_unicam_1.lezione1;

public class FiguraGeometrica {

    private String nome;
    private int nLati;
    protected double area;
    private String colore;

    protected String ciao = "Ciao";

    public FiguraGeometrica(String nome, int nLati) {
        this.nome = nome;
        this.nLati = nLati;
        this.area = calcolaArea();
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

    public double getArea() {
        return area;
    }

    public void setnLati(int lati) {
        this.nLati = lati;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int calcolaArea() {
        return 0;
    }
      

    
}
