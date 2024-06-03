package POO.composicao;

public class Hora {
    private int hours, minutes, seconds;

    public Hora (int hora, int minuto, int segundos) {
        if (hora >= 0 && hora < 24) {
            this.hours = hora;
        } else {
            throw new IllegalArgumentException("hora invalida! ");
        }

        if (minuto >= 0 && minuto < 60) {
            this.minutes = minuto;
        } else {
            throw new IllegalArgumentException("minutos invalidos! ");
        }

        if (segundos >= 0 && segundos < 60) {
            this.seconds = segundos;
        } else {
            throw new IllegalArgumentException("segundos invalidos! ");
        }
    }

    @Override
    public String toString () {
        return String.format("%d:%d:%d", getHours(), getMinutes(), getSeconds());
    }

    public int getHours () {
        return this.hours;
    }

    public int getMinutes () {
        return this.minutes;
    }

    public int getSeconds () {
        return this.seconds;
    }
}
