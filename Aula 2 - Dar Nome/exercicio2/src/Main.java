package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int x, y, r;
        boolean whileController = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operaçäo de Diviäo \n");

        //Entrada de dois numeros inteiros;
        
        while(whileController){
            //InputMismatchException
            try{
                System.out.println("Informe o Dividendo...: ");
                x = scanner.nextInt();
                
    
                System.out.println("Informe o Divisor...: ");
                y = scanner.nextInt();
    
                r = x / y;  //divisáo entre dois numeros inteiros informados
    
                //Exibiçao de resultado da divisäo
                System.out.println("\nResultado da Divisäo: " + r);
            }catch(InputMismatchException e){
                System.out.println("Favor informe numeros validos para realizar a divisäo");
                scanner.nextLine(); //Precisa disso para limpar o buffer
                continue;
            }

            whileController = false;
            
        }
        
        scanner.close();
    }
}


