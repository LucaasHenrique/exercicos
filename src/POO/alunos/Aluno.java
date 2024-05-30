package POO.alunos;

public class Aluno {
    public String nome;
    public int idade;
    double notaMat;
    double notaFis;
    double media;

    // construtor
    public Aluno(String nome, int Idade, double NotaMat, double NotaFis) {
        this.nome = nome;
        notaMat =  NotaMat;
        notaFis =  NotaFis;
        idade = Idade;

        media = (notaFis + notaMat) / 2;
    }

    public Aluno(){
        System.out.println("Objeto criado");
    }

}
