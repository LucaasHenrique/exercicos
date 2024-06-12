package array.array;

public class foreach {
    public static void main(String[] args) {
        int[] notas = {5, 6, 7, 2, 4, 10, 2, 9, 5, 3, 8, 8, 9};
        float media = 0, soma = 0;

        for (int count: notas) {
            soma += count;
        }

        media = (float) soma / notas.length;
        System.out.println("soma de notas: " + soma);
        System.out.println("media: " + media);
    }
}
