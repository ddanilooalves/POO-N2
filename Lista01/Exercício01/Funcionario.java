/*01 - Declare uma classe com o nome Funcionario, está classe deverá ter um método com o
nome calculaSalario, que recebe um parâmetro double salario. Este método retornará o
valor do salario que o funcionário irá perceber, dado a restrição: $ 382,33+ 8,675% sobre
as vendas brutas se o valor da venda bruta for superior a $8.000,00, caso contrário o
calculo do salario será: $177,12 + 3,87%. Após isso crie uma classe com o nome
FuncionarioTeste que instancia a classe Funcionario e invoca o método calculaSalario,
passando como parâmetro o valor das vendas do funcionário em questão. */

package Exercício01;

public class Funcionario {
    public double calculaSalario(double vendaTotal) {
        if (vendaTotal > 8000.00) {
            return 382.33 + (0.08675 * vendaTotal);
        } else {
            return 177.12 + (0.0387 * vendaTotal);
        }
    }
}
