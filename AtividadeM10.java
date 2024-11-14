import java.util.Scanner;

public class AtividadeM10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;

        // Leia-se as 4 notas do console
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        // Calculando a média
        double media = somaNotas / 4;

        //exibindo a média calculada
        System.out.println( "Sua média é: " + media);

        // Condição de aprovação
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Fecha o scanner
        scanner.close();
    }
}
