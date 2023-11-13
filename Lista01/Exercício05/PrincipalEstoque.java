package Exercício05;

import java.util.Scanner;

public class PrincipalEstoque {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Informe o produto 1: ");
            String name1 = sc.next();
            System.out.println("Informe a quantidade atual em estoque: ");
            int qntAtual1 = sc.nextInt();
            System.out.println("Informe a quantidade minima em estoque: ");
            int qntMinima1 = sc.nextInt();

            System.out.println("Informe o produto 2: ");
            String name2 = sc.next();
            System.out.println("Informe a quantidade atual em estoque: ");
            int qntAtual2 = sc.nextInt();
            System.out.println("Informe a quantidade minima em estoque: ");
            int qntMinima2 = sc.nextInt();

            System.out.println("Informe o produto 3: ");
            String name3 = sc.next();
            System.out.println("Informe a quantidade atual em estoque: ");
            int qntAtual3 = sc.nextInt();
            System.out.println("Informe a quantidade minima em estoque: ");
            int qntMinima3 = sc.nextInt();

            Estoque estoque1 = new Estoque(name1, qntAtual1, qntMinima1);
            Estoque estoque2 = new Estoque(name2, qntAtual2, qntMinima2);
            Estoque estoque3 = new Estoque(name3, qntAtual3, qntMinima3);

            estoque1.darBaixa(10);
            estoque2.repor(5);
            estoque3.darBaixa(20);

            System.out.println("Precisa repor estoque1: " + estoque1.precisaRepor());
            System.out.println("Precisa repor estoque2: " + estoque2.precisaRepor());
            System.out.println("Precisa repor estoque3: " + estoque3.precisaRepor());

            System.out.println(estoque1.mostrar());
            System.out.println(estoque2.mostrar());
            System.out.println(estoque3.mostrar());
        }
    }
}
