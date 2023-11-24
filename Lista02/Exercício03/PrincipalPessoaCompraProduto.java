package Lista02.Exercício03;

import java.util.Scanner;

public class PrincipalPessoaCompraProduto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int condicao;

        Produto produto1 = new Produto(1, "Prato");
        produto1.adicionaProduto(produto1);
        Produto produto2 = new Produto(1, "Copo");
        produto2.adicionaProduto(produto2);

        System.out.println("Informe seu nome: ");
		String nome = input.nextLine();
		System.out.println("Informe seu CPF: ");
		String cpf = input.nextLine();
		System.out.println("Informe sua idade: ");
		int idade = input.nextInt();
		Pessoa pessoa1 = new Pessoa(nome, cpf, idade);
		
		input.nextLine();
		System.out.println("Informe o logradouro da sua residencia: ");
		String logradouro = input.nextLine();
		System.out.println("Informe a sua cidade natal: ");
		String cidade = input.nextLine();
		System.out.println("Informe o seu estado: ");
		String estado = input.nextLine();
		pessoa1.adicionaEndereco(logradouro, cidade, estado);

        System.out.println(" Desejar comprar (1 para sim | 2 para não): ");
        condicao = input.nextInt();
        while (condicao != 2) {
            System.out.println(" Escolha entre os produtos disponíveis: ");
            System.out.println("1 - " + produto1.getNome());
            System.out.println("2 - " + produto2.getNome());
            int escolha = validarEntrada(input.nextInt());
            if( escolha == 1){
                Compra compra = new Compra(pessoa1, produto1);
                compra.comprar(pessoa1, produto2);
                System.out.println(compra.verificarCompra());
            }else{
                Compra compra = new Compra(pessoa1, produto2);
                compra.comprar(pessoa1, produto2);
                System.out.println(compra.verificarCompra());
            }
            System.out.println(" Desejar continuar (1 para sim | 2 para não): ");
            condicao = input.nextInt();
            input.nextLine();
       }

       System.out.println("Finalizado!");
       input.close();
    }

    private static int validarEntrada(int entrada) {
        Scanner input = new Scanner(System.in);
        while (entrada != 1 && entrada != 2) {
            System.out.println(" No momento não temos esse produto (Digite 1 ou 2): ");
            entrada = input.nextInt();
        }
        return entrada;
    }
}
