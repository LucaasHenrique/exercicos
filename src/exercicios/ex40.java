package exercicios;
import java.util.Scanner;

public class ex40 {
    public static void main(String[] args) {
        float peso, altura;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com seu peso, em kilos: ");
        peso = entrada.nextFloat();

        System.out.print("Entre com sua altura, em metros: ");
        altura = entrada.nextFloat();

        System.out.printf("imc é %.2f", (imc(peso, altura)));
    }
    public static float imc (float peso, float altura) {
        return peso / quadrado(altura);
    }

    public static float quadrado(float num) {
        return num * num;
    }
}
