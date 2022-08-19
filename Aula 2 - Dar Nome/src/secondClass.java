package src;
//Interfaces e Exceções

class SecondClass{
    public static void main(String[] args){
        ContaCorrente a1 = new ContaCorrente();
        ContaCorrenteEspecial a2 = new ContaCorrenteEspecial();

        a1.registrarDeposito(200.0);
        a1.registrarSaque(100.0);


        a2.registrarDeposito(200.0);
        a2.registrarSaque(100.0);
        
        System.out.println(a2.getSaldo());
        System.out.println(a1.getSaldo());
        
    }
}