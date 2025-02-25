import java.util.Scanner;

public class pedidos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("                    Lanchonete                    ");
        System.out.println();
        System.out.println("Código             Especificação             Preço");
        System.out.println();
        System.out.println("1                 Cachorro-Quente          R$ 4.00");
        System.out.println("2                 X-Salada                 R$ 4.50");
        System.out.println("3                 X-Bacon                  R$ 5.00");
        System.out.println("4                 Torrada Simples          R$ 2.00");
        System.out.println("5                 Refrigerante             R$ 1.50");
        System.out.println();

        // Entrada de dados

        System.out.print("Pressione o código do pedido desejado: ");
        int codigo = sc.nextInt();

        System.out.print("Digite quantos lanches, deste tipo, você deseja: ");
        int quantidade = sc.nextInt();

        // Cálculo de dados

        double valorTotal = 0;
        String nome = "";

        if (codigo == 1) {

            nome = "Cachorro-Quente";
            valorTotal = (double) quantidade * 4.00 ;

        }
        else if (codigo == 2) {

            nome = "X-Salada";
            valorTotal = (double) quantidade * 4.50;

        }
        else if (codigo == 3){

            nome = "X-Bacon";
            valorTotal = (double) quantidade * 5.00;

        }
        else if (codigo == 4) {

            nome = "Torrada Simples";
            valorTotal = (double) quantidade * 2.00;

        }
        else if (codigo == 5) {

            nome = "Refrigerante";
            valorTotal = (double) quantidade * 1.50;

        }
        else {

            System.out.println("Código invalido. Reinice a máquina para refazer o pedido.");
    
        }

        // Saída de dados

        System.out.println("\nO " + nome + " foi pedido " + quantidade + " vezes.");
        System.out.printf("Valor total do pedido: R$ %.2f", valorTotal);
        
        sc.close();
    }

}
