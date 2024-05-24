package exercicios;

public class ex36 {
    public static void main(String[] args) {

        int g = 1;
        double gC = 1;

        for (int i=g; i<=64; i++){
            gC  *= 2;
            g += (int) gC;
        }
        System.out.println(g);
    }
}
