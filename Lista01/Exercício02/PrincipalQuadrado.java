import java.util.Scanner;

public class PrincipalQuadrado {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Instâncie o lado 2: ");
            double q1 = sc.nextDouble();
            System.out.println("Instâncie o lado 4: ");
            double q2 = sc.nextDouble();
            System.out.println("Instâncie o lado 5: ");
            double q3 = sc.nextDouble();
            
            Quadrado quadrado1 = new Quadrado(q1);
            Quadrado quadrado2 = new Quadrado(q2);
            Quadrado quadrado3 = new Quadrado(q3);

            System.out.println("###########");
            System.out.println("Quadrado 1:");
            System.out.println("Área: " + quadrado1.calculoArea());
            System.out.println("Perímetro: " + quadrado1.calculoPerimetro() + "\n");

            System.out.println("Quadrado 2:");
            System.out.println("Área: " + quadrado2.calculoArea());
            System.out.println("Perímetro: " + quadrado2.calculoPerimetro() + "\n");

            System.out.println("Quadrado 3:");
            System.out.println("Área: " + quadrado3.calculoArea());
            System.out.println("Perímetro: " + quadrado3.calculoPerimetro());
        }
    }
    
}
