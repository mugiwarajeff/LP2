public class RaizQuadradaHeron implements CalculoRaizQuadrada {

    @Override
    public double getRaizQuadrada(double n) {
       double rAnterior = n / 2;

        while((rAnterior * rAnterior) - n > 0.000){
            rAnterior = ((rAnterior + (n / rAnterior)) / 2);
        }

       return rAnterior;
    }
    
}
