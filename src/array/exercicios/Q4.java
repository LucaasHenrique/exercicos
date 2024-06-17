package array.exercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class Q4
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <String> pistas = new ArrayList<String>();
        String filme = filme();
        String nomeFilme;
        pistas = pistas();
        int tentativas = 5;

        for (int i = 0; i < tentativas; i++) {
            System.out.print("sua tentativa: ");
            nomeFilme = in.nextLine();

            System.out.println("pista: " + pistas.get(i));
            if (comparaFilme(filme, nomeFilme)) {
                int pontos = pontos(i);
                System.out.println("voce acertou! nome do filme era " + filme);
                System.out.println("Sua pontuaçao: " + pontos);
                break;
            } else {
                System.out.println("voce errou!");
            }
        }
    }

    public static ArrayList<String> pistas () {
        ArrayList <String> pistas = new ArrayList<String>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("pista %d: ", i);
            pistas.add(in.nextLine());
        }

        return pistas;
    }

    public static String filme() {
        Scanner in = new Scanner(System.in);
        System.out.printf("nome do filme: ");
        String filme = in.nextLine();

        return filme;
    }

    public static boolean comparaFilme (String filme, String tentativa) {
        return filme.equalsIgnoreCase(tentativa);
    }

    public static int pontos(int numPistas) {
        switch (numPistas) {
            case 1:
                return 100;
            case 2:
                return 60;
            case 3:
                return 40;
            case 4:
                return 20;
            case 5:
                return 10;
            default:
                return 0;
        }
    }
}
