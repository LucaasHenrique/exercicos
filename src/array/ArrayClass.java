package array;
import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] num = {5, 6, 3, 2, 1, 8 , 9, -3, 2, 10};
        int pos;

        System.out.println("Array: " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Array ordenado: " + Arrays.toString(num));

        pos = Arrays.binarySearch(num, 8);
        System.out.println("posiçao do num '8': " + pos);

        int[] newArray = Arrays.copyOf(num, 5);

        if (Arrays.equals(newArray, num)) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

        int[] nums = new int[5];
        Arrays.fill(nums, 8);

        System.out.println("fill: " + Arrays.toString(nums));
    }
}
