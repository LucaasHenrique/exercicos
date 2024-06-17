package array.exercicios;
import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 5 , 7, 9, 11, 12, 5, 19};
        int maior = max(nums);
        int menor = min(nums);
        int[] res = valores_entre(nums, maior, menor);

        System.out.println("resultado: " + Arrays.toString(res));
    }

    public static int[] valores_entre (int[] list, int max, int min) {
        ArrayList <Integer> res = new ArrayList<Integer>();

        for (int n: list) {
            if (n >= min && n <= max) {
                res.add(n);
            }
        }

        int[] resultado = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resultado[i] = res.get(i);
        }

        return resultado;

    }

    public static int min(int[] list) {
        int menor = list[0];

        for (int n: list) {
            if (n <= menor) {
                menor = n;
            }
        }

        return menor;
    }

    public static int max (int[] list) {
        int maior = list[0];
        int s_maior = 0;

        for (int n: list) {
            if (n >= maior) {
                s_maior = maior;
                maior = n;
            }
        }

        return maior;
    }
}

