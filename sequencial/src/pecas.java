import java.util.Scanner;

public class pecas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        // Introdução ao programa
        
        System.out.println("Iremos lhe informar o valor a ser pago pelas peças solicitadas.");
        System.out.println();

        // Entrada de dados

        System.out.print("Digite o código de uma peça 1: ");
        int pecaUm = sc.nextInt();
        System.out.print("Digite a quantidade de peças 1 que você deseja adquirir: ");
        int pecaUmQuantidade = sc.nextInt();
        System.out.print("Digite o valor unitário de cada peça 1: ");
        double pecaUmValor = sc.nextDouble();

        System.out.print("\nAgora, digite o código de uma peça 2: ");
        int pecaDois = sc.nextInt();
        System.out.print("Digite a quantidade de peças 2 que você deseja adquirir: ");
        int pecaDoisQuantidade = sc.nextInt();
        System.out.print("Digite o valor unitário de cada peça 2: ");
        double pecaDoisValor = sc.nextDouble();

        // Cálculo de dados

        double pecaUmValorTotal = (double) pecaUmQuantidade * pecaUmValor;
        double pecaDoisValorTotal = (double) pecaDoisQuantidade * pecaDoisValor;

        double valorPagar = pecaUmValorTotal + pecaDoisValorTotal;

        // Saída de dados

        System.out.printf("\nValor a pagar: R$ %.2f", valorPagar);

        sc.close();
    }

}
