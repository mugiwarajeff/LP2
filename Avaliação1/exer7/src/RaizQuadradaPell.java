public class RaizQuadradaPell implements CalculoRaizQuadrada{

    @Override
    public double getRaizQuadrada(double n) {
        int returnRaiz = 0;
        int incrementoImpar = 1;
        double parametroDecremento = n;

        while(parametroDecremento >= 0){

            if((parametroDecremento - incrementoImpar) < 0){
                break;
            }

            parametroDecremento -= incrementoImpar;
            returnRaiz++;
            incrementoImpar += 2;
        }
        
        return returnRaiz;
    }
}
