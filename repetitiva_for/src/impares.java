import java.util.Scanner;

public class impares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa 

        System.out.println("Insira um número e iremos lhe dizer os números ímpares até ele. ");

        // Entrada e Saída de dados

        System.out.print("Digite o número: ");
        int numero = sc.nextInt();

        for (int i = 1; i % 2 != 0 && i <= numero; i+=2) {

            System.out.print(i + " ");   
            
        }

        sc.close();

    }
}
