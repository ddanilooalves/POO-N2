package Lista02.Exercício02.Controle;

import Lista02.Exercício02.Entidade.Ator;
import Lista02.Exercício02.Entidade.Diretor;
import Lista02.Exercício02.Entidade.Filme;

public class CadastroFilme {

    private static Ator[] atores = new Ator[5];
    private static Diretor[] diretores = new Diretor[3];
    private static Filme[] filmes = new Filme[4];

    public static void main(String[] args) {
        Ator ator1 = new Ator("Harry Potter", 30, 2);
        Ator atriz1 = new Ator("Luna", 28, 1);
        Diretor diretor1 = new Diretor("Carlos", true);
        Filme filme1 = new Filme("A volta dos que não foram");

        Ator ator2 = new Ator("João", 30, 2);
        Ator atriz2 = new Ator("Lara", 28, 1);
        Diretor diretor2 = new Diretor("Lucas", true);
        Filme filme2 = new Filme("Sem volta");

        Diretor diretor3 = new Diretor("Luana", false);

        filme1.setAtorPrincipal(ator1);
        filme1.setAtrizPrincipal(atriz1);
        filme1.setDiretor(diretor1);

        filme2.setAtorPrincipal(ator2);
        filme2.setAtrizPrincipal(atriz2);
        filme2.setDiretor(diretor2);

        diretor1.setPrincipalFilme(filme1);
        diretor2.setPrincipalFilme(filme2);
        diretor3.setPrincipalFilme(filme1);

        atores[0] = ator1;
        diretores[0] = diretor1;
        filmes[0] = filme1;

        atores[1] = ator2;
        diretores[1] = diretor2;
        filmes[1] = filme2;

        atores[2] = ator1;
        diretores[2] = diretor3;
        filmes[2] = filme2;

        System.out.println("#### Descrição do Filme 1 ####");
        System.out.println("Título: " + filmes[0].getTitulo());
        System.out.println("Diretor: " + filmes[0].getDiretor().getNome());
        System.out.println("Ator Principal: " + filmes[0].getAtorPrincipal().getNome());
        System.out.println("Atriz Principal: " + filmes[0].getAtrizPrincipal().getNome());
        System.out.println("\n");

        System.out.println("#### Descrição do Filme 2 ####");
        System.out.println("Título: " + filmes[1].getTitulo());
        System.out.println("Diretor: " + filmes[1].getDiretor().getNome());
        System.out.println("Ator Principal: " + filmes[1].getAtorPrincipal().getNome());
        System.out.println("Atriz Principal: " + filmes[1].getAtrizPrincipal().getNome());
        System.out.println("\n");

        System.out.println("\n#### Descrição do Diretor ####");
        System.out.println("Nome: " + diretores[0].getNome());
        System.out.println("Principal Filme: " + diretores[0].getPrincipalFilme().getTitulo());

        System.out.println("\n#### Descrição do Diretor ####");
        System.out.println("Nome: " + diretores[1].getNome());
        System.out.println("Principal Filme: " + diretores[1].getPrincipalFilme().getTitulo());

        System.out.println("\n#### Descrição do Diretor ####");
        System.out.println("Nome: " + diretores[2].getNome());
        System.out.println("Principal Filme: " + diretores[2].getPrincipalFilme().getTitulo());

        Filme filme4 = new Filme("Pequena Sereia");
        Filme filme5 = new Filme("Sem volta");

        tentativaInserirFilme(filme4);
        tentativaInserirFilme(filme5);
        buscaDiretoresVencedoresOscar();
    }

    public static void tentativaInserirFilme(Filme novoFilme) {
        if (insereFilme(novoFilme)) {
            System.out.println("\n---------------------------");
            System.out.println("Filme inserido com sucesso!");
            System.out.println("---------------------------");
        } else {
            System.out.println("\n---------------------------");
            System.out.println("Falha ao inserir o filme. Título duplicado.");
            System.out.println("---------------------------");
        }
    }

    public static Filme buscaFilme(String titulo) {
        for (Filme filme : filmes) {
            if (filme != null && filme.getTitulo().equals(titulo)) {
                return filme;
            }
        }
        return null;
    }

    public static boolean insereFilme(Filme novoFilme) {
        if (buscaFilme(novoFilme.getTitulo()) != null) {
            return false;
        }

        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] == null) {
                filmes[i] = novoFilme;
                return true;
            }
        }

        return false;
    }

    public static void buscaDiretoresVencedoresOscar() {
        System.out.println("\n#### Diretores Vencedores de Oscars ####\n");
        for (Diretor diretor : diretores) {
            if (diretor != null && diretor.isGanhadorOscar() && diretor.getPrincipalFilme() != null) {
                Filme principalFilme = diretor.getPrincipalFilme();
                System.out.println("Diretor: " + diretor.getNome());
                System.out.println("Filme: " + principalFilme.getTitulo());
                System.out.println("Ator Principal: " + principalFilme.getAtorPrincipal().getNome());
                System.out.println("Atriz Principal: " + principalFilme.getAtrizPrincipal().getNome());
                System.out.println("------");
            }
        }
    }
}
