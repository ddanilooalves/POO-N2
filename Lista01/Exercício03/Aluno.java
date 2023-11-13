/*03 - Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina.
Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2
notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe:
a. Média: calcula a média final do aluno (composta pela média aritmética
das notas).
b. Final: considerando que a média do aluno esteja abaixo de 6.0, quanto ele
precisaria tirar no Exame Final para que sua média final seja pelo menos
5.0. */

package Exercício03;

public class Aluno {

    int mat;
    String name;
    private double n1;
    private double n2;
    private double notaTrabalho;

    public Aluno(int mat, String name, double n1, double n2, double notaTrabalho) {
        this.mat = mat;
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
        this.notaTrabalho = notaTrabalho;
    }

    public double calculoMedia() {
        return (n1 + n2 + notaTrabalho) / 3;
    }

    public double calculoFinal() {
        double mediaFinal = calculoMedia();
        if (mediaFinal >= 6.0) {
            return 0;
        } else {
            double notaFaltante = Math.max(0, (5.0 - 0.4 * mediaFinal) / 0.6);
            return notaFaltante;
        }
    }
}
