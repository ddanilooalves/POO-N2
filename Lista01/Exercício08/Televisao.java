/*08 - Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume
e trocar os canais da televisão. O controle de volume permite:
a. aumentar ou diminuir a potência do volume de som em uma unidade de
cada vez;
b. aumentar e diminuir o número do canal em uma unidade
c. trocar para um canal indicado;
d. consultar o valor do volume de som e o canal selecionado. */

package Exercício08;

public class Televisao {
    private int volume;
    private int canal;

    public Televisao() {
        this.volume = 50;
        this.canal = 1;
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentado para " + volume);
        } else {
            System.out.println("Volume no máximo.");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para " + volume);
        } else {
            System.out.println("Volume no mínimo.");
        }
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Canal aumentado para " + canal);
    }

    public void diminuirCanal() {
        if (canal > 1) {
            canal--;
            System.out.println("Canal diminuído para " + canal);
        } else {
            System.out.println("Canal no mínimo.");
        }
    }

    public void trocarCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100) {
            canal = novoCanal;
            System.out.println("Canal trocado para " + canal);
        } else {
            System.out.println("Canal inválido.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }
}
