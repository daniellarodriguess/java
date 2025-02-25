import java.util.Scanner;

public class lisarb {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("Iremos calcular e mostrar o valor que você deve pagar de Imposto de Renda");

        // Entrada de dados

        System.out.print("\nDigite o seu salário: ");
        double salario = sc.nextDouble();

        // Cálculo de dados

        double imposto;

        if (salario >= 0.0 && salario <= 2000.0) {

            imposto = 0.0;

        }
        else if (salario > 2000.0 && salario <= 3000.0) {

            imposto = (salario - 2000.0) * 0.08;

        }
        else if (salario > 3000.0 && salario <= 4500.0) {

            imposto = (salario - 3000.0) * 0.18 + (1000 * 0.08); 

        }
        else {

            imposto = (salario - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08); 

        }

        // Saída de dados 

        if (imposto == 0) {

            System.out.println("\nVocê está isento de impostos. ");

        } 
        else {

            System.out.printf("\nVocê deve pagar de Imposto de Renda: R$ %.2f.", imposto);

        } 

        sc.close();
    }
}
