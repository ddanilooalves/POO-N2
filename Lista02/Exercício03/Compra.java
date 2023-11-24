package Lista02.Exercício03;

public class Compra {
    private Pessoa pessoa;
    private Produto produto;

    public Compra(Pessoa pessoa, Produto produto) {
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public void comprar(Pessoa pessoa, Produto produto){
        if (produto.buscarProduto(produto.getCodigo())) {
            produto.darBaixar(produto);
            verificarCompra();
        } 
    }

    public String verificarCompra(){
        return "\n *** Compra realizada com sucesso por " + pessoa.consultaNome() + " do produto " + produto.consultaNome() + " *** \n";
    }
}
