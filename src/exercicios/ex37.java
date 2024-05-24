package exercicios;
import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double temp;
        char op, opc;

        do {
            System.out.print("digite a temperatura: ");
            temp = in.nextDouble();

            System.out.println("Opções " +
                    "F - Conversão de Graus Celsius em Graus Fahrenheit \n" +
                    "C – Conversão de Graus Fahrenheit em Graus Celsius");

            in.nextLine();

            System.out.print("sua opção [F/C]: ");
            opc = in.nextLine().charAt(0);

            switch (opc){
                case 'F': case 'f':
                    float f = (float) ((temp * 1.8) + 32);
                    System.out.printf("Temperatura em Fahrenheit: %.2f \n", f);
                    break;
                case 'C': case 'c':
                    float c = (float) ((temp - 32) / 1.8);
                    System.out.printf("Temperatura em Celsius: %.2f \n", c);
                    break;
                default:
                    System.out.println("opção invalida \n");
            }

            System.out.print("quer continuar [S/N]:");
            op = in.nextLine().charAt(0);

        } while ((op != 'N') && (op != 'n'));
    }
}
