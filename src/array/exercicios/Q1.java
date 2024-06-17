package array.exercicios;

import java.util.Arrays;
import java.util.ArrayList;

public class Q1 {
    public static void main (String[] args) {
        int[] nums = {5, 6, 7, 3, 2, 11, 6, 5, 4, 12, 10};
        int[] nums1 = {3, 4, 3, 1, 9, 19, 12, 5, 0, 2, 10};
        System.out.println("total de pares: " + totalPares(nums));
        System.out.println("maior: " + maiorValor(nums));
        System.out.println("total de iguais: " + totalIguais(nums, nums1));
    }
    public static int totalPares (int[] list) {
        int par = 0;
        for (int n: list) {
            if (n % 2 == 0) {
                par += 1;
            }
        }

        return par;
    }

    public static int maiorValor (int[] list) {
        int maior = list[0];
        for (int n: list) {
            if (n >= maior) {
                maior = n;
            }
        }

        return maior;
    }

    public static int totalIguais (int[] list, int[] list2) {
        int totalIguais = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == list2[i]) {
                totalIguais += 1;
            }
        }

        return totalIguais;
    }
}
