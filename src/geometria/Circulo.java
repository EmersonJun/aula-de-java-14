package geometria;

public class Circulo extends Formas{
    public Circulo(double base, double altura){
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return (3.14 * (altura * altura));
    }

    @Override
    public String toString() {
        return "circuloulo com base " + base + " e altura " + altura +" + "+" tem área: " + calcularArea();
    }
    
}
