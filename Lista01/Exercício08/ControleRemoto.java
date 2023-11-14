package Exercício08;

public class ControleRemoto {
    private Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }

    public void aumentarVolume() {
        televisao.aumentarVolume();
    }

    public void diminuirVolume() {
        televisao.diminuirVolume();
    }

    public void aumentarCanal() {
        televisao.aumentarCanal();
    }

    public void diminuirCanal() {
        televisao.diminuirCanal();
    }

    public void trocarCanal(int novoCanal) {
        televisao.trocarCanal(novoCanal);
    }

    public void exibirStatus() {
        System.out.println("Volume: " + televisao.getVolume());
        System.out.println("Canal: " + televisao.getCanal());
    }
}
