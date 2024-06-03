package POO.composicao;

public class Funcionario {
    private String nome;
    private boolean atraso;
    private double tempoTrabalhado, tempoAtraso;

    public Funcionario (String nome, Hora horaChegada, Hora horaSaida){
        this.nome = nome;
        this.tempoAtraso = tempoAtraso(horaChegada);
        if (this.tempoAtraso > 0 ) {
            this.atraso = true;
        }
        
        if (atraso) {
            System.out.println("Funcionario " + this.nome + " atrasado");
        }

        this.tempoTrabalhado = horasTrabalhadas(horaChegada, horaSaida);
    }

    private double tempoAtraso(Hora horaChegada) {
        return ((horaChegada.getHours()*60*60 + horaChegada.getMinutes()*60 +
                horaChegada.getSeconds()) - 8*3600.0)/3600.0;
    }

    private double horasTrabalhadas(Hora horaChegada, Hora horaSaida) {
        double horas = ( (horaSaida.getHours()*60 + horaSaida.getMinutes()) -
                (horaChegada.getHours()*60 + horaChegada.getMinutes()) )/60.0;

        if (horas < 0) {
            throw new IllegalArgumentException("hora saida anterior a hora de chegada!");
        }
        return horas;
    }

    public double getHorasTrabalhadas () {
        return this.tempoTrabalhado;
    }
}
