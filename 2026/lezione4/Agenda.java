
public class Agenda {
    
    Appuntamento [] agenda;
    int elements;

    public Agenda(int n){
        if (n < 0) {
            throw new RuntimeException("Lunghezza non valida");
        }
        this.agenda = new Appuntamento[n];
        this.elements = 0;
    }

    public boolean aggiungi(Appuntamento a){
        if (a == null){
            return false;
        }
        if (this.elements >= this.agenda.length){
            return false;
        }
        for (int i = 0; i < this.elements; i++ ){
            if (a.chrono() == this.agenda[i].chrono()){
                return false;
            }
        }
        int i = 0;
        while (i < this.elements && a.chrono() > this.agenda[i].chrono()){
            i++;
        }
        for (int j = this.elements; j > i; j--){
            this.agenda[j] = this.agenda[j-1];
        }
        this.agenda[i] = a;
        this.elements++;
        return true;
    }

    public boolean disdetta(int i){
        if (i < 0 || i >= this.elements ) {
            return false;
        }
        for (int j = i; j < this.elements-1; j++){
            this.agenda[j] = this.agenda[j+1];
        }
        this.agenda[this.elements-1] = null;
        this.elements--;
        return true;
    }

    public int numeroAppuntamenti(){
        return this.elements;
    }

    public Appuntamento appuntamento(int i){
        if (i < 0 || i >= this.elements ) {
            return null;
        }
        return this.agenda[i];
    }

    @Override 
    public String toString(){
        String s = "";
        for (int i = 0; i < this.elements; i++){
            s += this.agenda[i] + "\n";
        }
        return s;
    }

}
