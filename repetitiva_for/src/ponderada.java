import java.util.Scanner;

public class ponderada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("O programa irá funcionar de acordo com uma quantidade de vezes que o usuário desejar rodar o programa.");
        System.out.println("\nEssa quantidade representa o número de casos de testes que vem a seguir.");
        System.out.println("\nCada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.");
        System.out.println("\nO programa apresentará a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.");

        // Entrada de dados

        System.out.print("\nInforme a quantidade de vezes que você deseja que a média ponderada, entre 3 números, seja realizada: ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {

            System.out.print("\nInforme o primeiro número, sendo ele da " + i + "° rodada: ");
            double numeroUm = sc.nextDouble();

            System.out.print("Informe o segundo número, sendo ele da " + i + "° rodada: ");
            double numeroDois = sc.nextDouble();

            System.out.print("Informe o terceiro número, sendo ele da " + i + "° rodada: ");
            double numeroTres = sc.nextDouble();

            double contaMedia = ((numeroUm * 2) + (numeroDois * 3) + (numeroTres * 5)) / 10;

            System.out.printf("\nO resultado da " + i + "° média ponderada é: %.1f\n", contaMedia);
        }

        sc.close();
    }
}
