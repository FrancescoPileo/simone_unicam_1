package SoluzioneTutoratoBiblioteca;

public class Libro{
    private String autore, titolo;

    public Libro(String titolo, String autore) {
        if(autore == null || autore.length() == 0)
            throw new IllegalArgumentException();
        if(titolo == null || titolo.length() == 0)
            throw new IllegalArgumentException();
        this.autore = autore;
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.autore.hashCode();
        hash = 67 * hash + this.titolo.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Libro)) {
            return false;
        }
        final Libro other = (Libro) obj;
        return this.autore.equals(other.autore)
            && this.titolo.equals(other.titolo);
    }
    
}