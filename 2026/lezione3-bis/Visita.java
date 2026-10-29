public class Visita {
    private String nome;
    private String cognome;

    /**
     * Costruttore della classe Visita.
     * Lancia IllegalArgumentException se nome o cognome sono nulli o hanno meno di 2 caratteri.
     */
    public Visita(String nome, String cognome) {
        if (nome == null || cognome == null || nome.length() < 2 || cognome.length() < 2) {
            throw new IllegalArgumentException("Nome e cognome devono avere almeno 2 caratteri.");
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
}