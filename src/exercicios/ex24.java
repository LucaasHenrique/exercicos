package exercicios;

public class ex24 {
    public static void main(String[] args) {
        long i = System.currentTimeMillis();
        for (int c=1; c <= 1000000; c++){
            if (c % 2 == 0){
                continue;
            }
            if ((c % 17 == 0) && (c % 19 == 0)){
                System.out.println(c);
                break;
            }
        }
        System.out.println("Tempo de execução, em milisegundos: "+ (System.currentTimeMillis() -i));
    }
}