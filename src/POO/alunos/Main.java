package POO.alunos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        int idade;
        double notaFis, notaMat;

        System.out.print("digite o nome: ");
        nome = in.nextLine();
        System.out.print("digite a idade: ");
        idade = in.nextInt();
        System.out.print("digite a nota de matematica: ");
        notaMat = in.nextDouble();
        System.out.print("digite a nota de fisica: ");
        notaFis = in.nextDouble();

        Aluno aluno1 = new Aluno(nome, idade, notaMat, notaFis);

        System.out.println(aluno1.media);

        Aluno aluno2 = new Aluno();
    }
}
