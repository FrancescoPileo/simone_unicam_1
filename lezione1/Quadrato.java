package lezione1;

public class Quadrato extends FiguraGeometrica {

    private int lato;
    
    public static final String TIPO = "Quadrato";

    public Quadrato(int lato) {
        super("Quadrato", 4);
        this.lato = lato;
        this.area = calcolaArea();
    }

    public int getLato() {
        return lato;
    }

    public void setLato(int lato) {
        this.lato = lato;
        this.area = calcolaArea();
    }

    private double calcolaArea() {
        return lato * lato;
    }

    public static double calcolaArea(int lato) {
        return lato * lato;
    }
}
