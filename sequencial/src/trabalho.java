import java.util.Locale;
import java.util.Scanner;

public class trabalho {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);

        // Introdução ao programa
        
        System.out.println("Iremos informar o valor do salário do funcionário solicitado.");
        System.out.println();

        // Entrada de dados

        System.out.print("Informe o número do funcionário: ");
        int numeroFuncionario = sc.nextInt();
        System.out.print("Informe o seu número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();
        System.out.print("Informe o valor que recebe por hora: ");
        double valorHora = sc.nextDouble();

        // Cálculo de dados

        double salario = (double) horasTrabalhadas * valorHora;

        // Saída de dados

        System.out.println("\nNúmero do funcionário: " + numeroFuncionario);
        System.out.printf("Salário do funcionário: U$ %.2f", salario);
        
        sc.close();
    }
}
