package Lista02.Exercício04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalDado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        String[] nomeVencedores = new String[3];

        System.out.println("+++ CADASTRE OS 6 JOGADORES +++");
        for (int i = 0; i < 6; i++) {
            System.out.println(" Digite o nome do jogador: ");
            String nome = input.nextLine();
            System.out.println(" Digite o sexo do jogador: ");
            String sexo = input.nextLine();
            Pessoa novaPessoa = new Pessoa(nome, sexo);
            pessoas.add(novaPessoa);
        }

        System.out.println("+++ BEM VINDOS AO JOGO DOS DADOS +++\n");
        for (Pessoa x : pessoas) {
            System.out.println(x);
        }
        System.out.println("\n+++ JOGO INICIADO +++\n");

        int qtdVitoriasP1 = 0; 
        int qtdVitoriasP2 = 0;
        int aux = 0;

        for (int i = 0; i < 6; i+=2) {
            int a = i + 1;
            System.out.println("******************************************\n");
            qtdVitoriasP1 = 0; 
            qtdVitoriasP2 = 0;
            do {
                System.out.println("*** PLACAR ***");
                System.out.println("Quantidade de vitórias " + pessoas.get(i).getNome() + ": " + qtdVitoriasP1);
                System.out.println("Quantidade de vitórias " + pessoas.get(a).getNome() + ": " + qtdVitoriasP2);

                int jogadaP1Dado6 = pessoas.get(i).jogarDado6Faces();
                int jogadaP1Dado8 = pessoas.get(i).jogarDado8Faces();
                int jogadaP1 = jogadaP1Dado6 + jogadaP1Dado8;

                int jogadaP2Dado6 = pessoas.get(a).jogarDado6Faces();
                int jogadaP2Dado8 =  pessoas.get(a).jogarDado8Faces();
                int jogadaP2 = jogadaP2Dado6 + jogadaP2Dado8;
                System.out.println();
                System.out.println(pessoas.get(i).getNome() + " jogou o dado de 6 lados e obteve o valor -> " + jogadaP1Dado6 + " jogou o dado de 8 lados e obteve o valor -> " + jogadaP1Dado8);

                System.out.println(pessoas.get(a).getNome() + " jogou o dado de 6 lados e obteve o valor -> " + jogadaP2Dado6 + " jogou o dado de 8 lados e obteve o valor -> " + jogadaP2Dado8);
                System.out.println();
                if (jogadaP1 > jogadaP2) {
                    System.out.println(pessoas.get(i).getNome() + " venceu a rodada! PARABÉNS!");
                    qtdVitoriasP1++;
                }else if(jogadaP1 < jogadaP2){
                    System.out.println(pessoas.get(a).getNome() + " venceu a rodada! PARABÉNS!");
                    qtdVitoriasP2++;
                }else{
                    System.out.println("RODADA DEU EMPATE!");
                    System.out.println();
                }
                System.out.println();
            } while(qtdVitoriasP1 < 7 && qtdVitoriasP2 < 7);

            System.out.println("******************************************");
            System.out.println("FIM DO JOGO");

            if (qtdVitoriasP1 > qtdVitoriasP2) {
                System.out.println(pessoas.get(i).getNome() + " VENCEU O JOGO!");
                nomeVencedores[aux] = pessoas.get(i).getNome();

            }else{
                System.out.println(pessoas.get(a).getNome() + " VENCEU O JOGO!");
                nomeVencedores[aux] = pessoas.get(a).getNome();
            }  
            aux++; 
        }

        System.out.println("***********************************************");
        System.out.println("FIM DO JOGO");

        System.out.println("#### NOME DOS VENCEDORES ####");

        for (int i = 0; i < nomeVencedores.length; i++) {
            System.out.println("\t " + nomeVencedores[i]);
        }
        input.close();
    }
}
