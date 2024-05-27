package exercicios;

public class ex49 {
    public static void main(String[] args) {
        int a = 1, b = 20, c = 40;
        raizes(a, b, c);
    }

    public static int delta (int a, int b, int c) {
        return (b * b) - 4*a*c;
    }

    public static void raizes (int a, int b, int c) {
        int x1, x2;
        int delta = delta(a, b, c);

        if (delta <= 0) {
            System.out.println("Não existem raizes reais!!");
        } else {
            x1 = (int) ((-b + Math.sqrt(delta)) / 2*a);
            x2 = (int) ((-b - Math.sqrt(delta)) / 2*a);

            System.out.printf("raiz 1: %d, raiz 2: %d ", x1, x2);
        }
    }
}
