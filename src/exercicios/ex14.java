package exercicios;

import java.util.Objects;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continuar = true;
        char var;
        String senha = "l";

        while (continuar) {
            System.out.print("Digite a senha: ");
            String sen = input.next();
            if (sen.equals(senha)) {
                System.out.println("Senha correta! ");
                continuar = false;
            }
            else {
                System.out.println("senha incorreta!!");
                System.out.print("quer continuar [S/N]: ");
                var = input.next().charAt(0);
                if (var == 'N'){
                    continuar = false;
                }
            }
        }
    }
}
