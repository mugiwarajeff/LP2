package src;

public class SaldoMenorZeroException extends Exception {
    
    public SaldoMenorZeroException(){
        super("Saldo Insuficiente para saque");
    }
}
