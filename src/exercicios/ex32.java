package exercicios;
import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double altura;
        double peso;
        char op;
        int pm_ideal, pf_ideal;

        System.out.print("digite altura: ");
        altura = in.nextDouble();
        System.out.print("digite peso: ");
        peso = in.nextDouble();

        in.nextLine();

        System.out.println("Digite sua opçao [1(m)/2(f)]: ");
        op = in.nextLine().charAt(0);

        switch (op){
            case 'm':
                pm_ideal = (int) ((72.7*altura) - 58);
                System.out.println("Peso ideal: " + pm_ideal);
                break;
            case 'f':
                pf_ideal = (int) ((62.1 *altura) - 44.7);
                System.out.println("Peso ideal: " + pf_ideal);
                break;
            default:
                System.out.println("Opção inválida.");
        }
        in.close();
    }
}
