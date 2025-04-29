import geometria.Circulo;
import geometria.Quadrado;
import geometria.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quad = new Quadrado(5, 0);
        Triangulo tria = new Triangulo(7, 9);
        Circulo circ = new Circulo(0,9);
        System.out.println("quadrado: "+quad.calcularArea());
        System.out.println("triangulo: "+tria.calcularArea());
        System.out.println("circulo: "+circ.calcularArea());
    }
}
