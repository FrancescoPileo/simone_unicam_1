package lezione1;

public class main {

    public static void main(String[] args) {

        int[] numeri = {1, 7, 3, 9, 5};
        System.out.print("Prima della chiamata: ID:" + numeri );
        stampaArray(numeri);
        int[] numeriinvertiti = inverti2(numeri);
        System.out.print("Dopo la chiamata: ID " + numeriinvertiti);
        stampaArray(numeriinvertiti);
        System.out.println("Minimo: " + min_array(numeriinvertiti));
        System.out.println("Massimo: " + max_array(numeriinvertiti));
        int[] concatena = concatena_array(numeri, numeriinvertiti);
        System.out.print("Array concatenato: ID " + concatena);
        stampaArray(concatena);
    }

    static int duplica(int n) {
        return n * 2;
    }

    static void inverti(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    static int[] inverti2(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[b.length - 1 - i];
        }
        return b; 
    }

    static void stampaArray(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    static int min_array(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    static int max_array(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    static int[] concatena_array(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        
        return c;
    }
    
}
