import java.util.Scanner;

public class divisores {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("Informe um número, a partir disso iremos lhe informar os divisores do número indicado.");

        // Entrada de dados e Saída de dados

        System.out.print("\nDigite o número que você deseja saber os seus divisores: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {

            if (numero % i == 0) {

                System.out.println("O número " + i + " é um divisor de " + numero + ".");

            }

        }

        sc.close();
    }
}
