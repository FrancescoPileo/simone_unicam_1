package EserciziTutoratoBiblioteca;

public class Libro {

    private String titolo;
    private String autore;

    public Libro(String titolo, String autore) throws IllegalArgumentException {
        if (titolo == null || titolo.length() == 0) {
            throw new IllegalArgumentException("Titolo non valido");
        }
        if (autore == null || autore.length() == 0) {
            throw new IllegalArgumentException("Autore non valido");
        }
        this.titolo = titolo;
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Libro other = (Libro) obj;
        return titolo.equals(other.titolo) && autore.equals(other.autore);
    }


}