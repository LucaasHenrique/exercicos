package array;
import java.util.ArrayList;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero: ");
            nums.add(in.nextInt());
        }

        System.out.println(nums);
    }
}
