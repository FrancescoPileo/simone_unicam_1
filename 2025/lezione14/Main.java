package lezione14;

public class Main {
    

    public static void main(String[] args) {
        SistemaSolare sistema = new SistemaSolare(5);
        sistema.nuovo(new Pianeta("A", 5, 2));
        sistema.nuovo(new Pianeta("B", 7, 1));
        sistema.nuovo(new Pianeta("C", 7, 3));

        System.out.println(sistema);
        System.out.println("Il pianeta più massiccio è: " + sistema.getMaxPianeta());
    }
}
