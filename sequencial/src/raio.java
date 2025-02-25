import java.util.Scanner;

public class raio {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("Iremos realizar o cálculo do raio do círculo.");
        System.out.println("Considere o valor de pi = 3.14159.");
        System.out.println();

        // Entrada de dados

        double pi = 3.14159;

        System.out.print("Qual é o valor do raio? ");
        double raio = sc.nextDouble();

        // Cálculo de dados

        double resultado = pi * Math.pow(raio, 2);

        // Saída de dados

        System.out.printf("\nO valor do raio desse círculo, de raio '%.2f', é %.4f.", raio, resultado);

        sc.close();        
    } 
}
