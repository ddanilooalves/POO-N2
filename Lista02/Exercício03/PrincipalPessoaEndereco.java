package Lista02.Exercício03;

import java.util.Scanner;
public class PrincipalPessoaEndereco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = input.nextLine();
		System.out.println("Informe seu CPF: ");
		String cpf = input.nextLine();
		System.out.println("Informe sua idade: ");
		int idade = input.nextInt();
		
		Pessoa p = new Pessoa(nome, cpf, idade);
		
		input.nextLine();
		System.out.println("Informe o logradouro da sua residencia: ");
		String logradouro = input.nextLine();
		System.out.println("Informe a sua cidade natal: ");
		String cidade = input.nextLine();
		System.out.println("Informe o seu estado: ");
		String estado = input.nextLine();
		
		p.adicionaEndereco(logradouro, cidade, estado);
		
		System.out.println(p);
		
		p.adicionaEndereco("Setor Pedro Ludovico", "Goiania", "GO");
		
		System.out.println(p);
		input.close();
	}
}
