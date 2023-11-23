package Lista02.Exercício04;

import java.util.Random;

public class Pessoa {
    private String nome;
    private String sexo;
    private Data dataNascimento;
    private Endereco endereco;
    private Dado meuDadoDe6Faces;
    private Dado meuDadoDe8Faces;

    public Pessoa(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
        this.meuDadoDe6Faces = new Dado(6);
        this.meuDadoDe8Faces = new Dado(8);
    }

    public Pessoa(String nome, String sexo, Endereco endereco, Data dataDeNascimento){
        this.nome = nome;
        this.sexo = sexo;
        this.meuDadoDe6Faces = new Dado(6);
        this.meuDadoDe8Faces = new Dado(8);
        this.endereco = endereco;
        this.dataNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Dado getMeuDadoDe6Faces() {
        return meuDadoDe6Faces;
    }

    public void setMeuDadoDe6Faces(Dado meuDadoDe6Faces) {
        this.meuDadoDe6Faces = meuDadoDe6Faces;
    }

    public Dado getMeuDadoDe8Faces() {
        return meuDadoDe8Faces;
    }

    public void setMeuDadoDe8Faces(Dado meuDadoDe8Faces) {
        this.meuDadoDe8Faces = meuDadoDe8Faces;
    }

    public String toString() {
        return "*** DADOS DO(A) JOGADOR(A) ***\n Nome: " + this.nome + "\n Sexo: " + this.sexo + "\n Número de Lados, 1 dado: " + this.meuDadoDe6Faces.getnLados() + "\n Número de Lados, 2 dado: " + this.meuDadoDe8Faces.getnLados();
    }

    public int jogarDado6Faces(){
        Random rd = new Random();
        return rd.nextInt(meuDadoDe6Faces.getnLados()) + 1;
    }

    public int jogarDado8Faces(){
        Random rd = new Random();
        return rd.nextInt(meuDadoDe6Faces.getnLados()) + 1;
    }

    public void adicionaEndereco(String nomeDaRua, int numeroRua, String cidade) {
		this.endereco = new Endereco(nomeDaRua, numeroRua, cidade);
	}

    public void adicionaData(int dia, int mes, int ano) {
		this.dataNascimento = new Data(dia, mes, ano);
	}
}
