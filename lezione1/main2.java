package lezione1;

public class main2 {
    
    public static void main(String[] args) {

        FiguraGeometrica figura = new FiguraGeometrica("Poligono", 5);
        figura.setColore("Rosso");
        System.out.println(figura);

        Cerchio cerchio = new Cerchio(4.5);
        cerchio.setColore("Blu");
        System.out.println(cerchio);
    }

    
}
