public class Aluno {
    private int mat;
    private String nome;
    private double N1, N2;

    public Aluno(int mat, String nome, double N1, double N2) {
        this.mat = mat;
        this.nome = nome;
        this.N1 = N1;
        this.N2 = N2;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return N1;
    }

    public void setN1(double N1) {
        this.N1 = N1;
    }

    public double getN2() {
        return N2;
    }

    public void setN2(double N2) {
        this.N2 = N2;
    }

}
