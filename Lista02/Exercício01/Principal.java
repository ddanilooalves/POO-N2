import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe os dados do aluno " + (i + 1) + ":");
            System.out.print("Número de Matrícula: ");
            int mat = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Nota do 1º Bimestre: ");
            double N1 = scanner.nextDouble();
            System.out.print("Nota do 2º Bimestre: ");
            double N2 = scanner.nextDouble();

            Aluno aluno = new Aluno(mat, nome, N1, N2);
            listaAlunos.add(aluno);
        }

        System.out.println("\nSituação dos Alunos:");
        for (Aluno aluno : listaAlunos) {
            double media = (aluno.getN1() + aluno.getN2()) / 2;
            System.out.println(aluno.getNome() + " - Matrícula: " + aluno.getMat() +
                    " - Média: " + media + " - Situação: " + (media >= 6.0 ? "APROVADO" : "REPROVADO"));
        }
        scanner.close();
    }
}
