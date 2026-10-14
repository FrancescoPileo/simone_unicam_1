package lezione1_4;

public class Quadrato extends FiguraGeometrica {

    private int lato;
    
    public static final String TIPO = "Quadrato";

    public Quadrato(int lato) {
        super("Quadrato", 4);
        this.lato = lato;
    }

    public int getLato() {
        return lato;
    }

    public void setLato(int lato) {
        this.lato = lato;
    }

    public double getArea() {
        return lato * lato;
    }
}
