import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("Iremos calcular o fatorial do número indicado pelo usuário.");

        // Entrada de dados e Saída de dados

        int resultado = 1;

        System.out.print("\nPor favor, insira um número: ");
        int numero = sc.nextInt();

        if (numero == 0) {

            System.out.println("\nResultado: " + resultado);

        } else {

            resultado *= numero;
            
            for (int i = 1; i < numero; i++) {

                resultado *= (numero - i); 

            }

            System.out.println("\nResultado: " + resultado);

        }

        sc.close();
    }
}
