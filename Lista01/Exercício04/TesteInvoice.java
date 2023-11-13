package Exercício04;

import java.util.Scanner;

public class TesteInvoice {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String numItem;
            String item;
            int qnt;
            double preco;

            System.out.println("Informe o número do item: ");
            numItem = sc.next();
            System.out.println("Informe qual produto é: ");
            item = sc.next();
            System.out.println("Informe a quantidade: ");
            qnt = sc.nextInt();
            System.out.println("Informe o preço do produto: ");
            preco = sc.nextDouble();

            Invoice invoice = new Invoice(numItem, item, qnt, preco);

            System.out.println("##########");
            System.out.println("Número do Item: " + invoice.getNumItem());
            System.out.println("Descrição do Item: " + invoice.getDescItem());
            System.out.println("Quantidade: " + invoice.getQnt());
            System.out.println("Preço Unitário: " + invoice.getPcUnitario());
            System.out.println("Valor da Fatura: " + invoice.getInvoiceAmount());
        }
    }
    
}
