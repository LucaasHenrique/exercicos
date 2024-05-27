package exercicios;
import java.util.Scanner;

public class ex44 {
    public static void main(String[] args) {
        float valor1, valor2, valor3, valor4, valor5;
        Scanner in = new Scanner(System.in);

        System.out.print("valor: ");
        valor1 = in.nextFloat();
        System.out.print("valor: ");
        valor2 = in.nextFloat();
        System.out.print("valor: ");
        valor3 = in.nextFloat();
        System.out.print("valor: ");
        valor4 = in.nextFloat();
        System.out.print("valor: ");
        valor5 = in.nextFloat();

        System.out.println("media de 5 valores: " + media(valor1, valor2, valor3, valor4, valor5));
        System.out.println("media de 4 valores: " + media(valor1, valor2, valor3, valor4));
    }
    
    public static float media (float... valores){
        float media = 0;

        // pecorre os valores digitados
        for (float valor: valores) {
            media += valor;
        }

        return media/valores.length;
    }
}
