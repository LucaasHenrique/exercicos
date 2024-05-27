package exercicios;

public class ex43 {
    public static void main(String[] args) {
        System.out.println("int 2 ao quadrado: " + quadrado(2));
        System.out.println("pi ao quadrado: " + quadrado(Math.PI));
    }

    public static int quadrado(int num) {
        int quadrado;
        quadrado = num * num;
        return quadrado;
    }

    public static double quadrado (double num) {
        double quadrado;
        quadrado = num * num;
        return quadrado;
    }
}
