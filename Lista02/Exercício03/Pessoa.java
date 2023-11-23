package Lista02.Exercício03;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private int idade;
	private List<Endereco> enderecos;
	
	public Pessoa(String nome, String cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.enderecos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	public void adicionaEndereco(Endereco endereco) {
		this.enderecos.add(endereco);	
	}
	
	public void adicionaEndereco(String logradouro,
			String cidade, String estado) {
		this.enderecos.add(new Endereco(logradouro, cidade, estado));
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", enderecos=" + enderecos + "]";
	}
	
	
}
