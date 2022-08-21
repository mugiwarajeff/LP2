
public class Conta {
    
    private double saldo; 
    private double saldoMinimo;

    public Conta(double saldoMinimo){
        this.saldo = 0;
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldoMinimo(){
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo){
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double deposito){
        saldo += deposito;
    }
    
    public void sacar(double saque) throws SaldoInsuficienteException {
        if(saldo - saque < saldoMinimo){
            throw new SaldoInsuficienteException();
        }else {
            saldo -= saque;
        }
    }


}
