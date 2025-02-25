import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("Tente adivinhar a senha.");

        // Entrada de dados

        System.out.print("\nDigite a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {

            System.out.println("\nSenha inválida.");
            System.out.print("Digite novamente: ");
            senha = sc.nextInt();

        }

        // Saída de dados

        System.out.println("\nAcesso permitido!\n");

        sc.close();
    }


}