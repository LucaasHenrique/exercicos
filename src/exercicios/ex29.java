package exercicios;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float dep_Inicial, inv_mensal, lucro = 0, juros = 0.005f;
        int n_meses;
        System.out.print("deposito inicial: ");
        dep_Inicial = in.nextFloat();
        System.out.print("investimento mensal: ");
        inv_mensal = in.nextFloat();
        System.out.print("numero de meses: ");
        n_meses = in.nextInt();

        for (int i=0; i<=n_meses; i++){
            lucro += inv_mensal;
            lucro *= (float) (1 + juros);
        }

        System.out.printf("lucro R$: %.2f \n", lucro);
        System.out.printf("total: %.2f", dep_Inicial + lucro);
    }
}
