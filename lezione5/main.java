package lezione5;

public class main {

    public static void main(String[] args) {
        Magazzino m = new Magazzino();
        m.aggiungiProdotto(new Vernice(12.5, 10, "rosso", 2.5));
        m.aggiungiProdotto(new Lampadina(5.0, 20, 60));
        m.aggiungiProdotto(new Chiodo(0.10, 100, 5.0));
        m.stampaMagazzino();
        double totale = m.calcolaValoreTotale();
        System.out.println("Totale valore magazzino: " + totale);

     }
    
}
