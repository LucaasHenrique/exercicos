package exercicios;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int notas_alunos, soma=0, c = 0;
        double media;
        String op;

        while (true) {
            System.out.println("Digite a nota do aluno: ");
            notas_alunos = input.nextInt();
            System.out.println("quer continuar [S/N]: ");
            op = input.next();
            c++;
            soma += notas_alunos;
            if (op.equalsIgnoreCase("N")){
                break;
            }
        }
        media = soma / c;
        System.out.println("a media da turma é: " + media);
    }
}
