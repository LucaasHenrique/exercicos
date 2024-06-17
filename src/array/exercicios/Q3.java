package array.exercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] list1 = {3, 2, 1, 5, 6, 7};
        int[] list2 = {8, 9, 10, 3, 4, 14, 1};
        int[] uniao = uniao(list1, list2);
        System.out.println("novo array: "+ Arrays.toString(uniao));
    }

    public static int[] uniao (int[] list1, int[] list2) {
        int[] uni = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++) {
            uni[i] = list1[i];
        }

        for (int i = 0; i < list2.length; i++) {
            uni[list1.length + i] = list2[i];
        }

        return uni;
    }
}
