package lezione5;

import java.util.ArrayList;

public class Magazzino {

    private ArrayList<Prodotto> prodotti;

    public Magazzino() {
        this.prodotti = new ArrayList<Prodotto>();
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
    }

    public void stampaMagazzino() {
        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto.toString());
        }
    }

    public double calcolaValoreTotale() {
        double totale = 0.0;
        for (Prodotto prodotto : prodotti) {
            totale += prodotto.getPrezzo() * prodotto.getQuantita();
        }
        return totale;
    }
    
}
