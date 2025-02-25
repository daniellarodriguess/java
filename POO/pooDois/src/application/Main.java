package application;

import java.util.Scanner;
import entities.Funcionario;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("Informe os dados de um funcionário.");

        // Entrada e Saída de dados

        Funcionario dados = new Funcionario();

        System.out.print("\nPrimeiro, forneça o nome do funcionário: ");
        dados.nome = sc.nextLine();
        System.out.print("Agora, forneça o salário bruto desse funcionário: ");
        dados.salarioBruto = sc.nextDouble();
        System.out.print("Por fim, forneça o imposto aplicado: ");
        dados.imposto = sc.nextDouble();

        System.out.println("\n" + dados.toString());

        System.out.print("\nAgora, forneça um número que indique a porcentagem de aumento salarial desse funcionário: ");
        double porcentagemAumento = sc.nextDouble();
        dados.aumento(porcentagemAumento);

        System.out.println("Dados atualizados: " + dados.nome + ", R$ " + dados.aumento(porcentagemAumento) + ".");

        sc.close();
    }
}
