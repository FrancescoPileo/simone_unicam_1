package lezione15;

public class Visita {

    private String nome;
    private String cognome;

    public Visita(String nome, String cognome) {
        if  (nome == null || cognome == null) {
            throw new IllegalArgumentException("Nome e cognome non possono essere null");
        }
        if (nome.length() < 2 || cognome.length() < 2) {
            throw new IllegalArgumentException("Nome e cognome devono avere almeno 2 caratteri");
        }
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    @Override
    public String toString() {
        return "Visita{nome='" + nome + "', cognome='" + cognome + '}';
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Visita) {
            Visita v = (Visita) obj;
            return this.nome.equals(v.nome) && this.cognome.equals(v.cognome);
        }
        return false;
    }
    
}
