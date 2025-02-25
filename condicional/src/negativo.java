import java.util.Scanner;

public class negativo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        // Introdução ao programa

        System.out.println("Iremos lhe informar se um número inteiro é 'não negativo' ou 'negativo'.");

        // Entrada de dados

        System.out.print("\nInforme o número inteiro: ");
        int numero = sc.nextInt();

        // Saída de dados

        if (numero > 0) {

            System.out.println("\nO número " + numero + " é considerado 'não negativo'.");

        }
        else if (numero == 0) {

            System.out.println("\nO número " + numero + " é considerado neutro.");

        } 
        else {

            System.out.println("\nO número " + numero + " é considerado 'negativo'.");

        }

        sc.close();
    }

}