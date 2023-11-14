package Exercício06;

public class TesteAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.armazenaPessoa("Paulo Gabriel", 25, 1.75f);
        agenda.armazenaPessoa("Pedro Samuel", 30, 1.60f);
        agenda.armazenaPessoa("Maria", 22, 1.80f);

        agenda.imprimeAgenda();

        int posicaoMaria = agenda.buscaPessoa("Pedro Samuel");
        agenda.imprimePessoa(posicaoMaria);

        agenda.removePessoa("Paulo Gabriel");
        agenda.imprimeAgenda();
    }
}
