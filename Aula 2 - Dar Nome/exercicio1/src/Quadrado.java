package exercicio1.src;


public class Quadrado extends Quadrilatero {
    
    public Quadrado(double lado){
        super(lado, lado, lado, lado);
    }

    @Override
    public double area() {
        return Math.pow(this.lado1,  2);

    }
}
