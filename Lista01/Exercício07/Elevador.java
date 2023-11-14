/*07 - Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de
andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas
pessoas estão presentes nele. A classe deve também disponibilizar os seguintes
métodos: */

package Exercício07;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public void inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador.");
        } else {
            System.out.println("O elevador está cheio. Não é possível entrar mais pessoas.");
        }
    }

    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador.");
        } else {
            System.out.println("O elevador está vazio. Não há pessoas para sair.");
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("O elevador subiu para o andar " + andarAtual + ".");
        } else {
            System.out.println("O elevador já está no último andar. Não é possível subir mais.");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("O elevador desceu para o andar " + andarAtual + ".");
        } else {
            System.out.println("O elevador já está no térreo. Não é possível descer mais.");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }
}
