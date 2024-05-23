package exercicios;
import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int c, n_horas, h_max = 50, E = 0;
        float s_hora = 10.0f, s_exd = 20.0f, sal, sal_ext = 0;
        char op;

        do {
            System.out.print("Codigo do operario: ");
            c = in.nextInt();
            System.out.print("Horas trabalhadas: ");
            n_horas = in.nextInt();

            if (n_horas > h_max) {
                E = n_horas - 50;
                sal = n_horas * s_hora;
                sal_ext = E * s_exd;
            } else {
                sal = n_horas * s_hora;
            }

            System.out.printf("codigo: %d, numero de horas: %d, salario: R$ %.2f, salario extra: R$ %.2f \n", c, n_horas, sal, sal_ext);
            System.out.print("quer continuar [S/N]: ");

            in.nextLine();

            op = in.nextLine().charAt(0);

        } while ((op != 'N') && (op != 'n'));
    }
}
