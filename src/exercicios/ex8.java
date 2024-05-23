package exercicios;

public class ex8 {
    public static void main(String[] args) {
        int n0 = 1, razao = 3, an=n0, valor_max=20;
        System.out.printf("Elementos da PA, de valor inicial %d e razao %d, menores que %d\n", n0, razao, valor_max);
        while (an <= valor_max){
            System.out.println(an);
            an += razao;
        }
    }
}