package exercicios;

public class ex42 {
    public static void main(String[] args) {
        System.out.println("Valor de PI: " + Math.PI);
        System.out.println("Numero de Euler: " + Math.E);

        System.out.println("'e' elevado ao quadrado: " + Math.exp(2));
        System.out.println("2 elevado ao cubo: " + Math.pow(2, 3));

        System.out.println("raiz quadrada de PI: " + Math.sqrt(Math.PI));
        System.out.println("O logaritmo natural de 10 é = "+ Math.log(10) );
        System.out.println("O logaritmo natural de 'e' é = "+ Math.log( Math.E ));

        System.out.println("O seno de 90 é = "+ Math.sin( (Math.PI)/2 ) );
        System.out.println("O cosseno de 0 é = "+ Math.cos(0) );
        System.out.println("A tangente de 45 é= "+ Math.tan( (Math.PI)/4 ));
    }

    public static float IMC(float peso, float altura){
        return peso/(float)Math.pow(altura, 2);
    }
}

/*Para calcular o módulo de um número 'numero' usamos: Math.abs(numero)
Para calcular o valor mínimo de dois números 'num1' e 'num2', usamos: Math.min(num1,num2)


Para calcular o valor máximo de dois números 'num1' e 'num2', usamos: Math.max(num1,num2)

Para arredondar um número 'numero' para cima, usamos: Math.ceil(numero)
Para arredondar um número 'numero' para baixo, usamos: Math.floor(numero)
*/