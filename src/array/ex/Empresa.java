package array.ex;

public class Empresa {
    Funcionario[] empregados;
    String cnpj, nome;
    int numFunc;

    Empresa (String nome, String cnpj) {
        empregados = new Funcionario[10];
        numFunc=0;
        this.cnpj = cnpj;
        this.nome = nome;

    }

    public void adiciona (Funcionario f) {
        if (numFunc < 10) {
            this.empregados[numFunc] = f;
        }
        numFunc++;
    }

    public void mostraEmpregados () {
        System.out.println("Empresa " + this.nome + " CNPJ " + this.cnpj);
        for (int i = 0; i < numFunc; i++) {
            System.out.println("Empregado de numero " + (i+1) + ": R$ " + empregados[i].getSalario());
        }
    }

    public boolean contem (Funcionario f) {
        for (Funcionario funcionario: empregados) {
            if (funcionario.numero == f.numero) {
                return true;
            }
        }
        return false;
    }
}
