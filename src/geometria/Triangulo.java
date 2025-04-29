package geometria;

public class Triangulo extends Formas{

    public Triangulo(double base, double altura){
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "triângulo com base " + base + " e altura " + altura +" + "+" tem área: " + calcularArea();
    }
    

}
