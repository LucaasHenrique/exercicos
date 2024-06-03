package POO.composicao;

public class ControleHorario {
    public static void main(String[] args) {
        Hora horaChegada = new Hora(8, 0, 1);
        Hora horaSaida = new Hora(9, 30, 0);

        Funcionario lucas = new Funcionario("lucas", horaChegada, horaSaida);

        System.out.println("hora de chegada: " + horaChegada.toString());
        System.out.println("hora de saida: " + horaSaida.toString());
        System.out.printf("horas trabalhadas: %.1f \n", lucas.getHorasTrabalhadas());
    }
}
