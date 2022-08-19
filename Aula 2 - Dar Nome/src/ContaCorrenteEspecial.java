package src;

public class ContaCorrenteEspecial extends ContaCorrente {

    public ContaCorrenteEspecial(){
        super();
        Double imposto = 0.1 / 100;
        super.setImposto(imposto);
    }
}
