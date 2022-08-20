package exercicio.src;

public class Main {
    public static void main(String[] args){
        Quadrilatero a1 = new Quadrado(5);
        Quadrilatero a2 = new Retangulo(5, 10);

        System.out.println(a1.area());
        System.out.println(a1.perimetro());
        System.out.println(a2.area());
        System.out.println(a2.perimetro());
    }
}
