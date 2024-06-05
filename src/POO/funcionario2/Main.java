package POO.funcionario2;

public class Main {
    public static void main(String[] args) {
        Data dataF1 = new Data(17, 1, 2024);
        Funcionario f1 = new Funcionario("felipe", dataF1, 1780,"884733");
        Data dataF2 = new Data(19, 1, 2024);
        Funcionario f2 = new Funcionario("paulo", dataF2,2000, "4324243");

        if (f1.equals(f2)) {
            System.out.println("iguais! ");
        } else {
            System.out.println("diferentes! ");
        }

        f1.mostra();
        f2.mostra();
    }
}
