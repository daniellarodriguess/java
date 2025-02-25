import java.util.Scanner;

public class quadrantes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("Forneça-nos dois números, os quais são denominados coordenadas.");
        System.out.println("A partir disso, iremos lhe informar em que quadrante, de um plano cartesiano, essas coordenadas se encontram.");

        // Entrada de dados

        System.out.print("\nInforme o valor da coordenada X: ");
        double x = sc.nextDouble();

        System.out.print("Informe o valor da coordenada Y: ");
        double y = sc.nextDouble();

        // Saída de dados

        if (x == 0 && y == 0) {

            System.out.println("\nAs coordenadas encontram-se na Origem do plano cartesiano.");

        }
        else if (x > 0 && y > 0) {

            System.out.println("\nAs coordenadas encontram-se no Primeiro Quadrante do plano cartesiano.");

        }
        else if (x < 0 && y > 0) {

            System.out.println("\nAs coordenadas encontram-se no Segundo Quadrante do plano cartesiano.");

        }
        else if (x < 0 && y < 0) {

            System.out.println("\nAs coordenadas encontram-se no Terceiro Quadrante do plano cartesiano.");

        }
        else if (x > 0 && y < 0) {

            System.out.println("\nAs coordenadas encontram-se no Quarto Quadrante do plano cartesiano.");

        }

        sc.close();
    }
}
