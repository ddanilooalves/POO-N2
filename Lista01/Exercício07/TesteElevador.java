package Exercício07;

public class TesteElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();

        elevador.inicializa(10, 5);

        elevador.entra();
        elevador.sobe();
        elevador.entra();
        elevador.sobe();
        elevador.sai();
        elevador.desce();

        System.out.println("Estado final do elevador:");
        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());
    }
}
