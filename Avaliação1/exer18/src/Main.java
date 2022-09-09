import java.util.Scanner;
 

public class Main {
    public static void main(String[] args) throws NumberFormatException{
        String inputString;
        Scanner input = new Scanner(System.in);
        boolean controleWhile = true;

        //texto Inicial
        System.out.println("Bem Vindo ao Meu Programa");
        System.out.println("Mostraremos o maior e o menor numero.");
        System.out.println("-------------------------------------------------------");

        //Começo do Programa
        while(controleWhile){
            System.out.print("Entre com os numeros inteiros separados por virgula: ");
            inputString = input.nextLine();

            String[] inputStringSeparado = inputString.split(",");
            Integer[] inputIntegers = new Integer[inputStringSeparado.length];

            try {
                //começo da iteraçao para conversäo de tipos
                for (int i = 0; i < inputStringSeparado.length; i++){
                    inputIntegers[i] = Integer.parseInt(inputStringSeparado[i].replace(" ", ""));          
                }

                //Demonstraçao do resultado se nao tiver erro
                System.out.printf("Maior Numero: %d\n", maiorMenor(inputIntegers)[1]);
                System.out.printf("Menor Numero: %d\n", maiorMenor(inputIntegers)[0]);
                controleWhile = false;   
            }catch(NumberFormatException e){
                //Tratamento do erro
                System.out.println("Sequencia invalida... Vamos novamente!");
            }
            
        }

        input.close();
    }


    //metodo statico para retornar o maior e o menor valor de um array numerico
    public static Integer[] maiorMenor(Integer[] listaDeNumeros){
        Integer[] numerosParaRetorno = new Integer[2];

        for (int i = 0; i < listaDeNumeros.length; i++){
            if (i == 0){
                numerosParaRetorno[0] = listaDeNumeros[i];
                numerosParaRetorno[1] = listaDeNumeros[i];
            }else{
                if (listaDeNumeros[i] > numerosParaRetorno[1]) numerosParaRetorno[1] = listaDeNumeros[i];
                if (listaDeNumeros[i] < numerosParaRetorno[0]) numerosParaRetorno[0] = listaDeNumeros[i];
            }
        }

        return numerosParaRetorno;
    }
}


