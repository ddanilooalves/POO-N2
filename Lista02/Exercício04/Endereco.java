package Lista02.Exercício04;

public class Endereco {
    private String nomeDaRua;
    private int numeroRua;
    private String bairro;
    private String cidade;
    private String estado;
    private long cep;

    public Endereco(String nomeDaRua, int numeroRua, String cidade) {
        this.nomeDaRua = nomeDaRua;
        this.numeroRua = numeroRua;
        this.cidade = cidade;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public int getNumeroRua() {
        return numeroRua;
    }

    public void setNumeroRua(int numeroRua) {
        this.numeroRua = numeroRua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public String toString() {
        return "### Endereço ### \n Rua: " + nomeDaRua + "\n Número: " + numeroRua + "\n Cidade: " + cidade;
    }    
}
