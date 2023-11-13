package Exercício03;

import java.util.Scanner;

public class AlunoPrincipal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe a matrícula do aluno(a): ");
            int mat = sc.nextInt();
            System.out.println("Informe o nome do aluno: ");
            String name = sc.next();
            System.out.println("Informe sua N1: ");
            double n1 = sc.nextDouble();
            System.out.println("Informe sua N2: ");
            double n2 = sc.nextDouble();
            System.out.println("Informe a nota do seu trabalho: ");
            double notaTrabalho = sc.nextDouble();

            Aluno aluno1 = new Aluno(mat, name, n1, n2, notaTrabalho);

            System.out.println("Média do aluno " + aluno1.name + ": " + aluno1.calculoMedia());
            System.out.println("Nota necessária no Exame Final: " + aluno1.calculoFinal());
        }
    }
}
