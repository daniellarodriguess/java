import java.util.Scanner;

public class divisao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("Insira um número, o qual representará a quantidade de pares de números inteiros.");
        System.out.println("Esse programa irá ler 'x' pares de números e mostrará a divisão do primeiro pelo segundo.");
        System.out.println("\nOBS: Caso o denominador seja igual a 0, a divisão é considerada impossível.");

        // Entrada de dados e Saída de dados

        System.out.print("\nDigite o número de pares: ");
        int paresQuantidade = sc.nextInt();

        for (int i = 1; i <= paresQuantidade; i++) {

            System.out.print("\nDigite o primeiro número, de tipo inteiro, do " + i + "° par de números: ");
            int numeroUm = sc.nextInt();

            System.out.print("\nDigite o primeiro número, de tipo inteiro, do " + i + "° par de números: ");
            int numeroDois = sc.nextInt();

            if (numeroDois != 0) {

                double contaDivisao = (double) numeroUm/numeroDois;

                System.out.printf("\nResultado da divisão: %.1f\n", contaDivisao);

            } 
            else {

                System.out.println("\nDivisão Impossível.\n");

            }

        }

        sc.close();
    }
}
