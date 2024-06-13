package array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLisst {
    public static void main(String[] args) {
        ArrayList <String> bandas = new ArrayList<String>();
        bandas.add("Alice in chains");
        bandas.add("Soundgarden");
        bandas.add("Audioslave");
        bandas.add("RATM");

        System.out.println("bandas: " + bandas);
        System.out.println("banda 2: " + bandas.get(2));
        bandas.add(bandas.indexOf("RATM"), "Pearl Jam");
        System.out.println("bandas: " + bandas);
        System.out.println("tamanho: " + bandas.size());
        bandas.remove("RATM");
        System.out.print( "Removendo tudo: " );
        bandas.clear();
        System.out.println(bandas);
    }
}
