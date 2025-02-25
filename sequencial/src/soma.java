import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        // Introdução ao programa

        System.out.println("Iremos realizar a soma de dois números do tipo inteiro.");
        System.out.println();

        // Entrada de dados
        
        System.out.print("Digite o primeiro número: ");
        int numeroUm = sc.nextInt();

        System.out.print("\nDigite o segundo número: ");
        int numeroDois = sc.nextInt();
        System.out.println();

        // Cálculo de dados

        int soma = numeroUm + numeroDois;

        // Saída de dados

        System.out.println("O resultado da soma é: " + soma);

        sc.close();
    }
}
