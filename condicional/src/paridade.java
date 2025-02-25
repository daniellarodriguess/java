import java.util.Scanner;

public class paridade {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        // Introdução ao programa

        System.out.println("Iremos lhe informar se um número inteiro é par ou ímpar.");

        // Entrada de dados

        System.out.print("\nInforme o número inteiro: ");
        int numero = sc.nextInt();

        // Saída de dados

        if (numero % 2 == 0) {

            System.out.println("\nO número é par.");

        }
        else {

            System.out.println("\nO número é ímpar.");

        }
        
        sc.close();
    }   
}
