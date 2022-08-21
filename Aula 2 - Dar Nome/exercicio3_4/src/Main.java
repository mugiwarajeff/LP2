import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException {
        double valor;
        Conta conta = null;
        boolean whileController = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe Saldo Mínimo: ");
        valor = scanner.nextDouble(); // entrada de saldo mínimo de conta

        conta = new Conta(valor); // inicialização de objeto da classe Conta

        System.out.print("\nInforme Depósito Inicial: ");
        valor = scanner.nextDouble(); // entrada de valor de depósito inicial da conta

        conta.depositar(valor); // operação de depósito

        while(whileController){
            try{
                System.out.print("\nInforme Saque após Depósito Inicial: ");
                valor = scanner.nextDouble(); // entrada de valor de saque após depósito
        
                conta.sacar(valor); // operação de depósito
            }catch(SaldoInsuficienteException e){
                System.out.println(e);
                scanner.nextLine();
                continue;
            }
            whileController = false;
        }
       
        // exibição de saldo corrente de conta após operações de depósito e saque
        System.out.println("\nSaldo Final: " + conta.getSaldo());

        scanner.close();
    }
}
