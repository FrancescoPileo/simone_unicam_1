package simone_unicam_1.lezione1;

public class TriangoloScaleno extends FiguraGeometrica {

    private int[] lati = new int[3];
    
    public static final String TIPO = "Triangolo";

    public TriangoloScaleno(int lati[]) {
        super("Triangolo Scaleno", 3);
        this.lati = lati.clone();
        this.area = calcolaArea();
    }

    public int[] getLati() {
        return lati;
    }

    public void setLati(int lati[]) {
        this.lati = lati.clone();
        this.area = calcolaArea();
    }

    private double calcolaArea() {
        
        return 6;
    }
    
}
