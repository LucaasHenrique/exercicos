package exercicios;
import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float num1, num2;
        char op, opc;

        do {
            System.out.print("digite um numero: ");
            num1 = in.nextFloat();

            System.out.print("digite um numero: ");
            num2 = in.nextFloat();

            in.nextLine();

            System.out.print("Digite sua opção [+, -, *, /]: ");
            op = in.nextLine().charAt(0);

            switch (op) {
                case '+':
                    System.out.println("soma: " + soma(num1, num2));
                    break;
                case '-':
                    System.out.println("subtração: " + sub(num1, num2));
                    break;
                case '*':
                    System.out.println("multiplicação: " + multi(num1, num2));
                    break;
                case '/':
                    System.out.println("divisão: " + div(num1, num2));
                    break;
                default:
                    System.out.println("opção invalida!!");
                    break;
            }

            System.out.print("quer continuar [S/N]: ");
            opc = in.nextLine().charAt(0);

        } while ((opc != 'N') && (opc != 'n'));

    }

    public static float soma (float a, float b) {
        return a + b;
    }

    public static float sub (float a, float b) {
        return a - b;
    }

    public static float multi (float a, float b) {
        return a * b;
    }

    public static float div (float a, float b) {
        return (float) a / b;
    }

}
