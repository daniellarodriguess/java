import java.util.Scanner;

public class intervalos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Introdução ao programa

        System.out.println("Iremos lhe informar onde determinado valor se encontra, entre os intervalos [0,25], (25,50], (50,75], (75,100].");
        
        // Entrada de dados 

        System.out.print("\nDigite o valor: ");
        double valor = sc.nextDouble();

        // Saída de dados

        if (valor >= 0.0 && valor <= 25.0) {

            System.out.println("\nO valor " + valor + " pertence ao intervalo [0,25].");

        }
        else if (valor > 25.0 && valor <= 50.0) {

            System.out.println("\nO valor " + valor + " pertence ao intervalo (25,50].");

        }
        else if (valor > 50.0 && valor <= 75.0) {

            System.out.println("\nO valor " + valor + " pertence ao intervalo (50,75].");

        }
        else if (valor > 75.0 && valor <= 100.0) {

            System.out.println("\nO valor " + valor + " pertence ao intervalo (75,100].");

        }
        else {

            System.out.println("\nO valor " + valor + " está fora dos intervalos registrados no sistema.");

        }

        sc.close();
    }
}
