package lezione15;

public class Main {

    public static void main(String[] args) {
        
        Coda c = new Coda(4);
        c.inserimento(new Visita("Francesco", "Pileo"));
        c.inserimento(new Visita("Simone", "Novelli"));
        c.inserimento(new Visita("Gabriele", "Bianchi"));
        c.inserimento(new Visita("Giovanni", "Rossi"));
    
        System.out.println(c.toString());

        /*System.out.println("Ho estratto:" + c.estazione().toString());

        System.out.println(c.toString());*/

        c.cancella("Gabriele", "Bianchi");

        System.out.println(c.toString());



    }
    
}
