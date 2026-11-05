public class Appuntamento {
    

    private String nome;
    private int giorno;
    private int ora;

    public Appuntamento(String nome, int giorno, int ora){
        if (nome == null) { 
            throw new RuntimeException("Nome non valido");
        }
        if (giorno < 1 || giorno > 365) {
            throw new RuntimeException("Giorno non valido");
        }
        if (ora < 0 || ora > 23){
            throw new RuntimeException("Ora non valida");
        }
        this.nome = nome;
        this.giorno = giorno;
        this.ora = ora;
    }

    public String getNome(){
        return this.nome;
    }

    public int getGiorno(){
        return this.giorno;
    }

    public int getOra(){
        return this.ora;
    }

    public int chrono(){
        return (this.giorno - 1) * 24 + this.ora; 
    }

    @Override 
    public String toString(){
        return "[ nome:" + this.nome + ", giorno:" + this.giorno + ", ora:" + this.ora + "]";
    }


}
