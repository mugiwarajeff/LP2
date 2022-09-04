import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double numeroInput;
        int escolha;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um numero para obter a raiz quadrada:");
        numeroInput = input.nextDouble();

        System.out.println("Escolha um metodo de calculo: ");
        System.out.println("[1] - Metodo de Pell");
        System.out.println("[2] - Metodo de Heron");
        escolha = input.nextInt();

        if(escolha == 1){
            RaizQuadradaPell r1 = new RaizQuadradaPell();
            System.out.printf("A raiz quadrade do numero %.0f é: %.0f\n", numeroInput, r1.getRaizQuadrada(17));
        }else if (escolha == 2){
            RaizQuadradaHeron r2 = new RaizQuadradaHeron();
            System.out.printf("A raiz quadrade do numero %.0f é: %.3f\n", numeroInput, r2.getRaizQuadrada(17));
        }

        input.close();
    }
}
