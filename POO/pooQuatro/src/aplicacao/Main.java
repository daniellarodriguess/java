package aplicacao;

import java.util.Scanner;
import calculos.Conversao;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa
        
        System.out.println("Iremos converter de real para dólar, de acordo com a cotação atual da moeda estadunidense.");
        System.out.println("OBS: Nessa conversão também estará incluso os 6% de IOF sobre o valor do dólar.");

        // Entrada de dados 

        Conversao dolar = new Conversao();
        
        System.out.print("\nInforme a cotação, atual, do dólar: ");
        dolar.cotacaoDolar = sc.nextDouble();

        System.out.print("Quantos dólares você deseja comprar? ");
        dolar.quantidadeDolar = sc.nextInt();

        // Saída de dados

        System.out.println(dolar.toString());

        sc.close();
    }

}
