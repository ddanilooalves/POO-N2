package Lista02.Exercício02.Entidade;

public class Diretor {
    private String nome;
    private boolean ganhadorOscar;
    private Filme principalFilme;

    public Diretor(String nome, boolean ganhadorOscar) {
        this.nome = nome;
        this.ganhadorOscar = ganhadorOscar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isGanhadorOscar() {
        return ganhadorOscar;
    }

    public void setGanhadorOscar(boolean ganhadorOscar) {
        this.ganhadorOscar = ganhadorOscar;
    }

    public Filme getPrincipalFilme() {
        return principalFilme;
    }

    public void setPrincipalFilme(Filme filme) {
        this.principalFilme = filme;
    }
}
