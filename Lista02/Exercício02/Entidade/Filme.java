package Lista02.Exercício02.Entidade;

public class Filme {
    private String titulo;
    private Diretor diretor;
    private Ator atorPrincipal;
    private Ator atrizPrincipal;

    public Filme(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public Ator getAtorPrincipal() {
        return atorPrincipal;
    }

    public Ator getAtrizPrincipal() {
        return atrizPrincipal;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public void setAtorPrincipal(Ator atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }

    public void setAtrizPrincipal(Ator atrizPrincipal) {
        this.atrizPrincipal = atrizPrincipal;
    }
}
