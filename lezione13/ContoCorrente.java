package lezione13;

public class ContoCorrente {

    private static int ID = 0;
    private final int numeroConto;
    private String nominativo;
    private double saldo;

    public ContoCorrente() {
        ID++;
        this.numeroConto = ID;
    }

    public ContoCorrente(String nominativo) {
        this.nominativo = nominativo;
        ID++;
        this.numeroConto = ID;
        this.saldo = 0;
    }

    public ContoCorrente(String nominativo, double saldo) {
        this.nominativo = nominativo;
        this.saldo = saldo;
        ID++;
        this.numeroConto = ID;
    }

    public static int getID() {
        return ID;
    }
    
    public int getNumeroConto() {
        return numeroConto;
    }

    public static void main(String[] args) {
        ContoCorrente c1 = new ContoCorrente("Simone", 1000);
        System.out.println("ID: " + c1.getNumeroConto()); // Output: ID: 1
        ContoCorrente c2 = new ContoCorrente("Luca", 500);
        System.out.println("ID: " + c2.getNumeroConto()); // Output: ID: 2
        ContoCorrente c3 = new ContoCorrente("Maria", 2000);
        System.out.println("ID: " + c3.getNumeroConto()); // Output: ID: 3

        System.out.println("ID: " + ContoCorrente.getID()); // Output: ID: 3
    }
}
