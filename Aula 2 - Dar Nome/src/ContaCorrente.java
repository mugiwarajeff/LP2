package src;

public class ContaCorrente {
    protected Double saldo;
    protected Double imposto;

    public ContaCorrente(){
        this.saldo = 0.0;
        this.imposto = 0.5/100;
    }

    public void setImposto(Double newImposto){
        this.imposto = newImposto;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public boolean registrarDeposito(Double valorDeposito){
        if (valorDeposito <= 0){
            return false;
        }else {
            this.saldo += valorDeposito;
            return true;
        }
    }

    public boolean registrarSaque(Double valorSaque){
        
        if (valorSaque <= 0){
            return false;
        }else {
            Double impostoSobreSaque = valorSaque * imposto;
            Double saqueComImposto = this.saldo + impostoSobreSaque;

            if (valorSaque < saqueComImposto){
                this.saldo -= (valorSaque + impostoSobreSaque);
                return true;
            }else {
                return false;
            }
        }
        
    }
}
