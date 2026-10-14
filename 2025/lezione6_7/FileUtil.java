package lezione6_7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileUtil {

    public static void leggiFile(String path) {
        File file = new File(path);

        try {
            FileInputStream in = new FileInputStream(file);
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char)c);
            }
            System.out.print("\n");
            in.close();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void scriviFile(String path, String contenuto, boolean append) {
        
        try {
            FileOutputStream out = new FileOutputStream(path, append);
            for (int i = 0; i < contenuto.length(); i++) {
                out.write(contenuto.charAt(i));
            }
            out.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void copiaFile(String sorgente, String destinazione) {

        try {
            FileInputStream in = new FileInputStream(sorgente);
            FileOutputStream out = new FileOutputStream(destinazione);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            in.close();
            out.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {

        leggiFile("lezione6/testo.txt");
        scriviFile("lezione6/testo.txt", " AAAAAA", true);
        leggiFile("lezione6/testo.txt");
        copiaFile("lezione6/testo.txt", "lezione6/copia_testo.txt");

    }

    public static void leggiFileReader(String path) {
        try {
            FileReader reader = new FileReader(path);
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char)c);
            }
            System.out.print("\n");
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void scriviFileWriter(String path, String contenuto, boolean append) {
        try {
            FileWriter writer = new FileWriter(path, append);
            writer.write(contenuto);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
