package files;
import java.io.*;

public class Files {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("/java/exercios/src/files/file.txt");
        InputStreamReader inFormatada = new InputStreamReader(in);

        int c;
        while ((c = inFormatada.read()) != -1) {
            System.out.print((char) c);
        }

        inFormatada.close(); // fechar o InputStreamReader
        in.close();
    }
}
