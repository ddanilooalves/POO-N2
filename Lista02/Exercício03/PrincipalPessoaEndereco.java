package Lista02.Exercício03;

import java.util.Scanner;

public class PrincipalPessoaEndereco {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Informe seu CPF: ");
		String cpf = entrada.nextLine();
		System.out.println("Informe sua idade: ");
		int idade = entrada.nextInt();
		
		Pessoa p = new Pessoa(nome, cpf, idade);
		
		entrada.nextLine();
		System.out.println("Informe o logradouro da sua residencia: ");
		String logradouro = entrada.nextLine();
		System.out.println("Informe a sua cidade natal: ");
		String cidade = entrada.nextLine();
		System.out.println("Informe o seu estado: ");
		String estado = entrada.nextLine();
		
		p.adicionaEndereco(logradouro, cidade, estado);
		
		System.out.println(p);
		
		p.adicionaEndereco("Setor Pedro Ludovico", "Goiania", "GO");
		
		System.out.println(p);
	}

}
