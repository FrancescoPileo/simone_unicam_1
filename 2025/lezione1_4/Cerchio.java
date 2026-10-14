package lezione1_4;

public class Cerchio extends FiguraGeometrica implements FiguraConRaggio {

    private double raggio;
    
    public static final String TIPO = "Cerchio";

    private static final double PI_GRECO = 3.14159;

    public Cerchio(double raggio) {
        super("Cerchio", 0);
        this.raggio = raggio;
    }

    public double getRaggio() {
        return this.raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public double getArea() {
        return PI_GRECO * this.raggio * this.raggio;
    }

    public static double calcolaArea(double raggio) {
        return 2 * PI_GRECO * raggio;
    }

    @Override
    public String toString() {
        return "Cerchio [raggio=" + raggio + ", area=" + getArea() + ", colore=" + super.colore +"]";
    }


    
}
