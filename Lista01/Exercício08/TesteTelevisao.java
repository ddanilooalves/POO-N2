package Exercício08;

public class TesteTelevisao {
    public static void main(String[] args) {
        Televisao minhaTelevisao = new Televisao();
        ControleRemoto meuControle = new ControleRemoto(minhaTelevisao);

        meuControle.exibirStatus();

        meuControle.aumentarVolume();
        meuControle.aumentarVolume();
        meuControle.diminuirVolume();

        meuControle.aumentarCanal();
        meuControle.diminuirCanal();
        meuControle.trocarCanal(7);

        meuControle.exibirStatus();
    }
}
