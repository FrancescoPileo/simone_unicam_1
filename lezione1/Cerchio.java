package simone_unicam_1.lezione1;

public class Cerchio extends FiguraGeometrica {

    private double raggio;
    
    public static final String TIPO = "Cerchio";

    private static final double PI_GRECO = 3.14159;

    public Cerchio(double raggio) {
        super("Cerchio", 0);
        this.raggio = raggio;
        this.area = calcolaArea();
    }

    public double getRaggio() {
        return this.raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
        this.area = calcolaArea();
    }

    private double calcolaArea() {
        return PI_GRECO * this.raggio * this.raggio;
    }

    public static double calcolaArea(double raggio) {
        return 2 * PI_GRECO * raggio;
    }


    
}
