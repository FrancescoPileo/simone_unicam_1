package lezione1_4;

public class main2 {
    
    public static void main(String[] args) {

        /*FiguraGeometrica figura = new FiguraGeometrica("Poligono", 5);
        figura.setColore("Rosso");
        System.out.println(figura);*/

        FiguraGeometrica figura2 = new Cerchio(2.5);
        System.out.println(figura2.getNome());

        Cerchio cerchio = new Cerchio(4.5);
        cerchio.setColore("Blu");
        System.out.println(cerchio);

        Sfera sfera = new Sfera(3.0);
        System.out.println(sfera);

        MaxRaggio(cerchio, sfera);
    }

    private static void MaxRaggio(FiguraConRaggio f1, FiguraConRaggio f2) {
        if (f1.getRaggio() > f2.getRaggio()) {
            System.out.println("Il raggio maggiore è: " + f1.getRaggio());
        } else if (f1.getRaggio() < f2.getRaggio()) {
            System.out.println("Il raggio maggiore è: " + f2.getRaggio());
        } else {
            System.out.println("I raggi sono uguali: " + f1.getRaggio());
        }
    }

    
}
