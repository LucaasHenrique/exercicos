package exercicios;

public class ex45 {
    public static void main(String[] args) {
        System.out.println("a media é " + media(5, 8, 9));
        System.out.println("a maior nota é " + maiorNota(5, 8, 9));
        System.out.println("a menor nota é " + menorNota(5, 8, 9));

    }

    public static float media (float... valores) {
         float media = 0, maior = valores[0], s_maior = 0;

         for (float valor: valores) {
             if (valor >= maior) {
                 s_maior = maior;
                 maior = valor;
             } else if ((valor >= s_maior) && (valor != maior)) {
                 s_maior = valor;
             }
         }
         media = (maior + s_maior) / 2;
         return media;
    }

    public static float maiorNota (float... valores){
        float maior = valores[0];

        for (float valor: valores) {
            if (valor >= maior) {
                maior = valor;
            }
        }
        return maior;
    }

    public static float menorNota (float... valores) {
        float menor = valores[0];

        for (float valor: valores) {
            if (valor <= menor) {
                menor = valor;
            }
        }
        return menor;
    }
}
