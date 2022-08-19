package exercicio.src;

public class Retangulo extends Quadrilatero {

    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
    }

    @Override
    public double area() {
        return this.lado1 * this.lado2;
    }
    
}
