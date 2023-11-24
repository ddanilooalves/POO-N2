package Lista02.Exercício03;

public class Endereco {
    private String logradouro;
    private String cidade;
    private String estado;
    
    public Endereco(String logradouro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString() {
        return "*** Endereco *** \n Logradouro: " + logradouro + "\n Cidade: " + cidade + "\n Estado: " + estado;
    }
}
