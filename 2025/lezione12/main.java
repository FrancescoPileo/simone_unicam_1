package lezione12;

public class main {
    public static void main(String[] args) {
        //System.out.println(calcolaResto(17, 5)); // Output: 2

        int c[][][] = {{{1, 2, 3}},
                {{4, 5, 6}, {7, 8, 9}},
                {}};
        System.out.println(c[2][1][0] == 16);

        int a[] = {1, 2, 3, 4, 5};
        System.out.println(a[2] == 3);

        int m[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(m[2][1] == 8);
        m[2][1] = 10;
        stampaMatrice(m);

        int[][] matriceIdentita = creaMatriceIdentita(4);
        stampaMatrice(matriceIdentita);







    }

    public static int[][] creaMatriceIdentita(int n) {
        int[][] matrice = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrice[i][i] = 1;
        }
        return matrice;
    }

    public static void stampaMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int calcolaResto(int dividendo, int divisore) {
        if (dividendo < divisore) {
            return dividendo;
        }
        return calcolaResto(dividendo - divisore, divisore);
    }

    public static int numeroDiFibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return numeroDiFibonacci(n - 1) + numeroDiFibonacci(n - 2);
    }

    public static int fattoriale(int n){
        if (n == 0){
            return 1;
        }
        return n * fattoriale(n - 1);
    }

    // sommatoria(10)

    public static int sommatoria(int n){
        if (n == 0){
            return 0;
        }
        return n + sommatoria(n - 1);
    }

    // funzione che calcola a^n
    double f(double a, int n){
        if (n == 0){
            return 1;
        } else if (n % 2 == 0){
            double x = f(a, n / 2);
            return x * x;
        } else {
            return a * f(a, n - 1);
        }
    }

    //f(10, 10)




}