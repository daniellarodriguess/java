import java.util.Scanner;

public class intervalos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("Digite a quantidade de números que você deseja inserir no programa.");
        System.out.println("Depois, digite, de acordo com a quantidade informada, os números."); 
        System.out.println("A partir disso, iremos lhe informar a quantidade de números presentes no intervalo [10, 20].");

        // Entrada de dados 

        int in = 0, out = 0;
        
        System.out.print("\nInforme a quantidade de números: ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {

            System.out.print("\nDigite o " + i + "° número: ");
            double numero = sc.nextDouble();

            if (numero >= 10 && numero <= 20) {

                in++;

            } 
            else {

                out++;

            }

        }

        // Saída de dados

        System.out.println("\nNúmeros dentro do intervalo [10, 20]: " + in);
        System.out.println("\nNúmeros fora do intervalo [10, 20]: " + out);

        sc.close();
    }
}
