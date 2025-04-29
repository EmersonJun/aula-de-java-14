package geometria;

public class Quadrado extends Formas {
    
    public Quadrado(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return base * base;
    }

    @Override
    public String toString() {
        return "Quadrado com base " + base + " e altura " + altura + " tem área: " + calcularArea();
    }
}
