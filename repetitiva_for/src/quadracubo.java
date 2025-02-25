import java.util.Scanner;

public class quadracubo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("Informe um número 'x'.");
        System.out.println("\nA partir do número 1, iremos informar, de 1 até 'x', o quadrado e o cubo destes números.");

        // Entrada de dados e Saída de dados

        System.out.print("\nAgora, digite o número: ");
        int numero = sc.nextInt();

        for (double i = 1.0; i <= numero; i++) {

            double contaUm = Math.pow(i, 2);
            double contaDois = Math.pow(i, 3);

            System.out.printf("\n%.1f, %.1f, %.1f\n", i, contaUm, contaDois);
        }

        System.out.println();
        sc.close();
    }
}
