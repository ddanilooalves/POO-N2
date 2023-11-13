/*05 - Escreva uma classe em Java chamada Estoque. Ela deverá possuir:
a) os atributos nome (String), qtdAtual (int) e qtdMinima (int).
b) um construtor sem parâmetros e um outro contendo os parâmetros nome, qtdAtual, e
qtdMinima.
c) os métodos com as seguintes assinaturas: */

package Exercício05;

public class Estoque {

    String name;
    private int qntAtual;
    private int qntMinima;

    public Estoque(String name, int qntAtual, int qntMinima) {
        this.name = name;
        this.qntAtual = Math.max(0, qntAtual);
        this.qntMinima = Math.max(0, qntMinima);
    }

    public Estoque() {

    }
    
    public void mudarName(String name) {
        this.name = name;
    }

    public void mudarQntMinima(int qntMinima) {
        this.qntMinima = Math.max(0, qntMinima);
    }

    public void repor(int qnt) {
        this.qntAtual += qnt;
    }

    public void darBaixa(int qnt) {
        if (qntAtual - qnt >= 0) {
            this.qntAtual -= qnt;
        } else {
            System.out.println("Não é possível dar baixa. Quantidade insuficiente em estoque.");
        }
    }

    public String mostrar() {
        return "Nome: " + name + ", Quantidade Mínima: " + qntMinima + ", Quantidade Atual: " + qntAtual;
    }

    public boolean precisaRepor() {
        return qntAtual <= qntMinima;
    }
}
