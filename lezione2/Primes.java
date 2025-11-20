package simone_unicam_1.lezione2;

public class Primes {

    private int valore;

    public Primes() {
        this.valore = 1;
    }

    private boolean isPrime(int n) {
        for (int i=2; i<=n/2; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public int next(){
        int next = valore + 1;
        while (isPrime(next) == false) {
            next++;
        }
        valore = next;
        return valore;
    }
         

}
