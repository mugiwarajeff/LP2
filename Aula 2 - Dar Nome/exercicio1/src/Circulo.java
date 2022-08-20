package exercicio1.src;

public class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double perimetro(){
        return 2 * Math.PI * this.raio;
    }

    @Override
    public double area(){
        return Math.PI * (raio * raio);
    }
}
