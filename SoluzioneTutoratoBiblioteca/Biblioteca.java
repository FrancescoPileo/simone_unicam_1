package SoluzioneTutoratoBiblioteca;

public class Biblioteca {
    private final Libro[] libri;
    private final boolean[] prestati;
    private int counter;
    private final float mora;
    public Biblioteca(int max, float mora){
        if(max <= 0 || mora <= 0f)
            throw  new IllegalArgumentException();
        this.mora = mora;
        libri = new Libro[max];
        prestati = new boolean[max];
    }

    public boolean aggiungiLibro(Libro l){
        if(l == null)
            throw  new IllegalArgumentException();
        if(counter >= libri.length) return false;
        libri[counter++] = l;
        return true;
    }

    public String[][] daiTutti(){
        if(counter == 0) return new String[0][0];
        String[][] matrix = new String[counter][2];
        for (int i = 0; i < counter; i++) {
            matrix[i] = new String[]{libri[i].getTitolo(), libri[i].getAutore()};
        }
        return matrix;
    }

    public boolean prestaLibro(String titolo, String autore){
        Libro daPrestare = new Libro(titolo, autore);
        for (int i = 0; i < counter; i++) {
            if(!prestati[i] && libri[i].equals(daPrestare)){
                prestati[i] = true;
                return true;
            }
        }
        return false;
    }

    
    public float restituisciLibro(String titolo, String autore, int giorniDiRitardo){
        if(giorniDiRitardo < 0)
            throw new IllegalArgumentException();
        Libro daRestituire = new Libro(titolo, autore);
        for (int i = 0; i < counter; i++) {
            if(prestati[i] && libri[i].equals(daRestituire)){
                prestati[i] = false;
                return giorniDiRitardo * this.mora;
            }
        }
        return -1;
    }
}
