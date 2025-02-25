import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("Iremos lhe informar se dois números inteiros, A e B, são múltiplos ou não são múltiplos.");

        // Entrada de dados

        System.out.print("\nInforme A, primeiro número inteiro: ");
        int a = sc.nextInt();
        System.out.print("Informe B, segundo número inteiro: ");
        int b = sc.nextInt();

        // Saída de Dados

        if (a % b == 0 || b % a == 0) {

            System.out.println("\nSão múltiplos.");

        } 
        else {

            System.out.println("\nNão são múltiplos.");

        }

        sc.close();
    }
}
