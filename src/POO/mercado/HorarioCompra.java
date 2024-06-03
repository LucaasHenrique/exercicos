package POO.mercado;

public class HorarioCompra {
    private int horas, minutos, segundos;
    private String dia;

    public HorarioCompra(String dia, int horas, int minutos, int segundos) {
        if (horas >= 0 && horas < 24) {
            this.horas = horas;
        } else {
            throw new IllegalArgumentException("hora invalida! ");
        }

        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        } else {
            throw new IllegalArgumentException("minutos invalida! ");
        }

        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        } else {
            throw new IllegalArgumentException("segundos invalidos! ");
        }

        this.dia = dia;
    }

    public String getDia () {
        return this.dia;
    }
    public int getHoras () {
        return this.horas;
    }

    public int getMinutos () {
        return this.minutos;
    }

    public int getSegundos () {
        return this.segundos;
    }
}
