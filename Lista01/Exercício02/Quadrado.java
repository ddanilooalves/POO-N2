/*02 - Escreva uma classe Quadrado com atributo lado do tipo double. A classe deve ter um
construtor que recebe como parâmetro o lado do quadrado. Deve também ter os métodos
area() e perimetro() que retornam respectivamente a área e o perímetro do quadrado, cujas
fórmulas são as seguintes: */

public class Quadrado {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public Quadrado() {

    }
    
    public double calculoArea() {
        return lado * lado;
    }

    public double calculoPerimetro() {
        return 4 * lado;
    }
}
