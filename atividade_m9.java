import java.util.Scanner;

public class atividade_m9 {

    public static void main(String args []){
        //criando um Scanner para ler a entrada de dado
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor numérico: ");
        int valorPrimitivo = scanner.nextInt(); //le o valor com o tipo primitivo (int)

        //Convertendo o valor primitivo para o tipo wrapper (Integer)
        Integer valorWrappInteger = Integer.valueOf(valorPrimitivo);

        //retornando os valores no console
        System.out.println("Valor primitivo (int): " + valorPrimitivo);
        System.out.println ("Valor wrapper (Integer): " + valorWrappInteger);

        scanner.close(); //Fechando o scanner


    }
}