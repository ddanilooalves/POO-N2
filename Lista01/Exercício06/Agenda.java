/*06 - Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
seguintes operações:
a. void armazenaPessoa(String nome, int idade, float altura);
b. void removePessoa(String nome);
c. int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
d. void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
e. void imprimePessoa(int index); // imprime os dados da pessoa que está na posição
“i” da agenda. */

package Exercício06;

public class Agenda {
    private Pessoa[] pessoas;
    private int qntPessoas;

    public Agenda() {
        this.pessoas = new Pessoa[10];
        this.qntPessoas = 0;
    }

    // Operação a. - Armazenar pessoa na agenda
    public void armazenaPessoa(String nome, int idade, float altura) {
        if (qntPessoas < 10) {
            Pessoa pessoa = new Pessoa(nome, idade, altura);
            pessoas[qntPessoas] = pessoa;
            qntPessoas++;
            System.out.println("Pessoa adicionada com sucesso!");
        } else {
            System.out.println("A agenda está cheia. Não é possível adicionar mais pessoas.");
        }
    }

    public void removePessoa(String nome) {
        int posicao = buscaPessoa(nome);
        if (posicao != -1) {
            for (int i = posicao; i < qntPessoas - 1; i++) {
                pessoas[i] = pessoas[i + 1];
            }
            qntPessoas--;
            System.out.println("Pessoa removida com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada na agenda.");
        }
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < qntPessoas; i++) {
            if (pessoas[i].getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void imprimeAgenda() {
        if (qntPessoas > 0) {
            System.out.println("Dados da agenda:");
            for (int i = 0; i < qntPessoas; i++) {
                System.out.println("Posição " + i + ": " + pessoas[i]);
            }
        } else {
            System.out.println("A agenda está vazia.");
        }
    }

    public void imprimePessoa(int index) {
        if (index >= 0 && index < qntPessoas) {
            System.out.println("Dados da pessoa na posição " + index + ": " + pessoas[index]);
        } else {
            System.out.println("Posição inválida na agenda.");
        }
    }

    private static class Pessoa {
        private String nome;
        private int idade;
        private float altura;

        public Pessoa(String nome, int idade, float altura) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
        }

        public String getNome() {
            return nome;
        }

        public String toString() {
            return "Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura;
        }
    }
    
}
