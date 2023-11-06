package Exercício01;

import java.util.Scanner;

public class FuncionarioTeste {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Funcionario funcionario = new Funcionario();

            double vendaTotal;
            System.out.println("Informe o valor total de suas vendas: ");
            vendaTotal = sc.nextDouble();

            double salario = funcionario.calculaSalario(vendaTotal);

            System.out.println("Salário do funcionário: R$" + salario);
        }
    }
}
