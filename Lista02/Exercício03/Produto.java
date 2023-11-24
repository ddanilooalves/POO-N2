package Lista02.Exercício03;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private long codigo;
    private String nome;
    private static List<Produto> listaProdutos = new ArrayList<>();

    public Produto(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public long getCodigo() {
        return codigo;
    }
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "*** Produto *** \n Codigo: " + codigo + "\n Nome: " + nome;
    }

    public String consultaNome(){
        return nome;
    }

    public void adicionaProduto(String nome, long codigo){
        this.listaProdutos.add(new Produto(codigo, nome));
    }

    public void adicionaProduto(Produto produto){
        this.listaProdutos.add(produto);
    }

    public boolean buscarProduto(long codigo){
        for (Produto produto : listaProdutos) {
            if (produto.codigo == codigo) {
                return true;
            }
        }
        return false;
    }

    public static Produto buscarProduto(String nome){
        for (Produto produto : listaProdutos) {
            if (produto.nome == nome) {
                return produto;
            }
        }
        return null;
    }

    public void darBaixar(Produto produto){
        listaProdutos.remove(produto);
    }
}
