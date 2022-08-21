public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(){
        super("Saldo da conta insuficiente para saque solicitado...");
    }
}
