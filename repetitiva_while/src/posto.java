import java.util.Scanner;

public class posto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("Iremos descobrir qual é o produto de preferência em um posto de gasolina. - OBS: Ao digitar 4, o programa é encerrado. \n");

        // Entrada de dados 

        System.out.println("                MENU                ");
        System.out.println();
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Fim");

        int x = 0, alcool = 0, gasolina = 0, diesel = 0;
        
        while (x != 4) {

            System.out.print("\nDigite o número do produto que você deseja: ");
            x = sc.nextInt();

            if (x == 1) {

                alcool++;

            }
            else if (x == 2) {

                gasolina++;

            }
            else if (x == 3) {

                diesel++;

            } 
            else if (x != 1 && x != 2 && x != 3 && x != 4){

                System.out.println("\nO número digitado é invalido, digite novamente.");

            }

        }

        // Saída de dados

        System.out.println("\nMuito obrigada!");

        System.out.println("\nO álcool foi pedido " + alcool + " vez(es).");
        System.out.println("A gasolina foi pedida " + gasolina + " vez(es).");
        System.out.println("O diesel foi pedido " + diesel + " vez(es).\n");

        sc.close();
    }
}
