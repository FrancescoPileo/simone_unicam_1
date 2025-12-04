package lezione1_4;

public class TriangoloScaleno extends FiguraGeometrica {

    private int[] lati = new int[3];
    
    public static final String TIPO = "Triangolo";

    public TriangoloScaleno(int lati[]) {
        super("Triangolo Scaleno", 3);
        this.lati = lati.clone();
    }

    public int[] getLati() {
        return lati;
    }

    public void setLati(int lati[]) {
        this.lati = lati.clone();
    }

    public double getArea() {
        double s = (lati[0] + lati[1] + lati[2]) / 2.0;
        return Math.sqrt(s * (s - lati[0]) * (s - lati[1]) * (s - lati[2]));
    }

 
}
