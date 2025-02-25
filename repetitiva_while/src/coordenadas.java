import java.util.Scanner;

public class coordenadas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("De acordo com as coordenadas dadas pelo usuário, iremos lhe informar o quadrante em que elas se encontram. Isso ocorrerá de forma repetitiva.");
        System.out.println("OBS: Caso uma das coordenadas seja 0, o programa irá parar e não retornará nenhum quadrante.");

        // Entrada de dados

        System.out.print("\nInforme a coordenada X: ");
        int x = sc.nextInt();

        System.out.print("Informe a coordenada Y: ");
        int y = sc.nextInt();

        // Saída de dados

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {

                System.out.println("\nEncontra-se no primeiro quadrante.");

            } 
            else if (x < 0 && y > 0) {

                System.out.println("\nEncontra-se no segundo quadrante.");

            }
            else if (x < 0 && y < 0) {

                System.out.println("\nEncontra-se no terceiro quadrante.");

            }
            else if (x > 0 && y < 0) {

                System.out.println("\nEncontra-se no quarto quadrante.");

            }

            System.out.print("\nInforme, novamente, coordenada X: ");
            x = sc.nextInt();

            System.out.print("Informe, novamente, coordenada Y: ");
            y = sc.nextInt();
            
        }

        System.out.println();

        sc.close();
    }



}