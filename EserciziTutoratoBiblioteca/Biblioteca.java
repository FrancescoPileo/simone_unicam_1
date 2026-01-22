package EserciziTutoratoBiblioteca;

public class Biblioteca {

    private Libro[] libri;
    private Libro[] prestiti;
    private int max;
    private float mora;

    private int nLibri;

    public Biblioteca(int max, float mora) {
        if (max <= 0) {
            throw new IllegalArgumentException("Max deve essere positivo");
        }
        if (mora < 0.0) {
            throw new IllegalArgumentException("Mora non può essere negativa");
        }
        this.max = max;
        this.mora = mora;
        this.libri = new Libro[max];
        this.prestiti = new Libro[max];
        this.nLibri = 0;
    }

    public boolean aggiungiLibro(Libro libro){
        if (libro == null) {
            throw new IllegalArgumentException("Libro non può essere null");
        }
        for (int i = 0; i < libri.length; i++) {
            if (libri[i] == null) {
                libri[i] = libro;
                this.nLibri++;
                return true;
            }
        }
        return false;
    }

    public String[][] daiTutti(){
        String[][] result = new String[nLibri][2];
        int index = 0;
        for (Libro libro : libri) {
            if (libro != null) {
                result[index][0] = libro.getTitolo();
                result[index][1] = libro.getAutore();
                index++;
            }
        }
        return result;
    }

    public boolean prestaLibro(String titolo, String autore){
        if (titolo == null || titolo.length() == 0) {
            throw new IllegalArgumentException("Titolo non valido");
        }
        if (autore == null || autore.length() == 0) {
            throw new IllegalArgumentException("Autore non valido");
        }
        Libro libroDaPrestare = new Libro(titolo, autore);
        for (Libro libro : libri) {
            if (libro != null && libro.equals(libroDaPrestare)) {
                if (controllaDisponibilità(libro)) {
                    //prestito possibile
                    aggiungiPrestito(libro);
                    return true;
                } else {
                    return false; //libro non disponibile
                }
            }
        }
        return false;
    }

    public float restituisciLibro(String titolo, String autore, int giorniInRitardo){
        if (titolo == null || titolo.length() == 0) {
            throw new IllegalArgumentException("Titolo non valido");
        }
        if (autore == null || autore.length() == 0) {
            throw new IllegalArgumentException("Autore non valido");
        }
        if (giorniInRitardo < 0) {
            throw new IllegalArgumentException("Giorni in ritardo non può essere negativo");
        }
        Libro libroDaRestituire = new Libro(titolo, autore);
        for (int i = 0; i < prestiti.length; i++) {
            if (prestiti[i] != null && prestiti[i].equals(libroDaRestituire)) {
                //libro trovato
                prestiti[i] = null; //rimuovo il prestito
                return giorniInRitardo * mora;
            }
        }
        return -1; //libro non trovato tra i prestiti
    }

    private boolean controllaDisponibilità(Libro libro) {
        for (Libro prestito : prestiti) {
            if (prestito != null && prestito.equals(libro)) {
                return false;
            }
        }
        return true;
    }

    private void aggiungiPrestito(Libro libro) {
        for (int i = 0; i < prestiti.length; i++) {
            if (prestiti[i] == null) {
                prestiti[i] = libro;
                return;
            }
        }
    }


}