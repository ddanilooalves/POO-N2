package Lista02.Exercício02.Entidade;

public class Ator {
    private String nome;
    private int idade;
    private int numOscars;

    public Ator(String nome, int idade, int numOscars) {
        this.nome = nome;
        this.idade = idade;
        this.numOscars = numOscars;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getNOscars() {
        return numOscars;
    }
}
