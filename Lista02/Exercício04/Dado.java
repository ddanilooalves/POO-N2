package Lista02.Exercício04;

public class Dado {
    private int nLados;

    public Dado(int nLados) {
        this.nLados = nLados;
    }

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public String toString() {
        return "*** DADO *** \n Número de Lados: " + nLados;
    }
}
