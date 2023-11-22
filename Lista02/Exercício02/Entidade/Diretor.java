package Lista02.Exercício02.Entidade;

public class Diretor {
    private String nome;
    private boolean ganhadorOscar;
    private Filme principalFilme;

    public Diretor(String nome, boolean ganhadorOscar) {
        this.nome = nome;
        this.ganhadorOscar = ganhadorOscar;
    }

    public void setPrincipalFilme(Filme principalFilme) {
        this.principalFilme = principalFilme;
    }

    public String getNome() {
        return nome;
    }

    public boolean isGanhadorOscar() {
        return ganhadorOscar;
    }

    public Filme getPrincipalFilme() {
        return principalFilme;
    }
}
