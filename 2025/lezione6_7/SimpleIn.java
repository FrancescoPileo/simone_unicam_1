package lezione6_7;

import java.io.InputStream;
import java.io.IOException;

public class SimpleIn {
    public static void main(String[] args) throws IOException {
        int charRead;
        while ((charRead = System.in.read()) >= 0) {
            System.out.write(charRead);
        }
    }
}
