package Lista02.Exercício02.Controle;

import java.util.ArrayList;

import Lista02.Exercício02.Entidade.Ator;
import Lista02.Exercício02.Entidade.Diretor;
import Lista02.Exercício02.Entidade.Filme;

public class CadastroFilme {

    private static ArrayList<Ator> atores = new ArrayList<>();
    private static ArrayList<Diretor> diretores = new ArrayList<>();
    private static ArrayList<Filme> filmes = new ArrayList<>();

    public static void main(String[] args) {
        cadastrarFilme("A volta dos que não foram", "Julios", true, "Iguana", "Crhis", "Rochele");
        cadastrarFilme("Gaspar", "Eduardo", false, "Largatixa", "Fantasmo", "Fantasma");
        cadastrarFilme("A volta dos que não foram", "Michele", true, "Camelo", "Harry", "Luna"); 

        imprimirDescricoes();
        buscarDiretoresVencedoresOscar();
    }

    public static void cadastrarFilme(String titulo, String nomeDiretor, boolean ganhadorOscar, String pricipalFilme, String nomeAtor, String nomeAtriz) {
        Diretor diretor = buscarOuCriarDiretor(nomeDiretor, ganhadorOscar, pricipalFilme);
        Ator ator = buscarOuCriarAtor(nomeAtor);
        Ator atriz = buscarOuCriarAtor(nomeAtriz);

        if (!insereFilme(new Filme(titulo, diretor, ator, atriz))) {
            System.out.println("Inserção falhou. Filme já cadastrado." + "\n");
        }
    }

    public static boolean insereFilme(Filme filme) {
        if (buscaFilme(filme.getTitulo()) == null) {
            filmes.add(filme);
            return true;
        }
        return false;
    }

    public static Filme buscaFilme(String titulo) {
        for (Filme filme : filmes) {
            if (filme.getTitulo().equals(titulo)) {
                return filme;
            }
        }
        return null;
    }

    private static Diretor buscarOuCriarDiretor(String nome, boolean ganhadorOscar, String principalFilme) {
        for (Diretor diretor : diretores) {
            if (diretor.getNome().equals(nome)) {
                return diretor;
            }
        }

        Diretor novoDiretor = new Diretor(nome, ganhadorOscar);
        diretores.add(novoDiretor);
        return novoDiretor;
    }

    private static Ator buscarOuCriarAtor(String nome) {
        for (Ator ator : atores) {
            if (ator.getNome().equals(nome)) {
                return ator;
            }
        }

        Ator novoAtor = new Ator(nome, 0, 0);
        atores.add(novoAtor);
        return novoAtor;
    }
    
    private static void imprimirDescricoes() {
        for (Filme filme : filmes) {
            System.out.println("Título: " + filme.getTitulo());
            System.out.println("Nome do Diretor: " + filme.getDiretor().getNome());
            System.out.println("Nome do Ator Principal: " + filme.getAtorPrincipal().getNome());
            System.out.println("Nome da Atriz Principal: " + filme.getAtrizPrincipal().getNome());
            System.out.println();
        }

        for (Diretor diretor : diretores) {
            System.out.println("Nome do Diretor: " + diretor.getNome());
            if (diretor.getPrincipalFilme() != null) {
                System.out.println("Nome do Principal Filme: " + diretor.getPrincipalFilme().getTitulo());
            }
            System.out.println();
        }
    }

    public static void buscarDiretoresVencedoresOscar() {
        for (Diretor diretor : diretores) {
            if (diretor.isGanhadorOscar() && diretor.getPrincipalFilme() != null) {
                Filme principalFilme = diretor.getPrincipalFilme();
    
                System.out.println("Nome do Diretor Vencedor do Oscar: " + diretor.getNome());
                System.out.println("Nome do Filme Vencedor do Oscar: " + principalFilme.getTitulo());
                System.out.println("Nome do Ator Principal: " + principalFilme.getAtorPrincipal().getNome());
                System.out.println("Nome da Atriz Principal: " + principalFilme.getAtrizPrincipal().getNome());
                System.out.println();
            }
        }
    }
}
