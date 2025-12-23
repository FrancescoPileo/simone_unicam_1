package lezione6;

import java.io.OutputStream;
import java.io.IOException;

public class SimpleOut {
public static void main(String[] args) throws IOException {
    for (int i=0;i<args.length;i++) { 
        println(args[i]);
    }
}

public static void println( String m ) throws IOException {
    for( int i=0; i<m.length(); i++) {
        System.out.write(m.charAt(i) & 0xff);
    }
    System.out.write(' ');
    System.out.flush();
    }
}