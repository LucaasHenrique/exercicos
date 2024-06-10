package POO.exemplo;

public class Zoo {
    public static void main(String[] args) {
        Vaca mimosa = new Vaca();
        Gato bichano = new Gato();
        Carneiro barnabe = new Carneiro();

        Animal bichos[] = {mimosa, bichano, barnabe};

        for (Animal animal: bichos){
            System.out.println(animal.nome + "é da classe " + animal.getClass().getName() + ", tem "  + animal.numeroPatas + " patas é faz ");
            animal.som();
            System.out.println();
        }
    }
}
