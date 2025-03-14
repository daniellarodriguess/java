package aplicacao;

import java.util.Scanner;
import entidades.Banco;

public class Main {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner (System.in);
        Banco titularBanco = null;

        // Introdução ao código

        System.out.println("Bem-vindo ao Banco 'X'. Por favor, insira os dados para cadastrarmos uma nova conta bancária.");

        // Entrada de dados

        System.out.print("\nPrimeiro, insira o número do novo usuário da conta bancária: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.print("Agora, insira o nome do novo titular da conta bancária: ");
        String nomeTitularConta = sc.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.print("Por último, você deseja inserir um saldo inicial? Clique em 'S/s' para sim e 'N/n' para não: ");
        char resposta = sc.next().charAt(0);

        if (resposta == 'S' || resposta == 's') {

            System.out.print("\nÓtimo, insira o valor desejado: ");
            double saldoInicialConta = sc.nextDouble();

            titularBanco = new Banco (numeroConta, nomeTitularConta, saldoInicialConta);

        } 
        else if (resposta == 'N' || resposta == 'n') {

            titularBanco = new Banco (numeroConta, nomeTitularConta);

        }

        // Saída de dados

        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("\nRegistrando dados... (som de tec-tec-tec do teclado)");
        System.out.println("Pronto, dados registrados. Nova conta cadastrada com sucesso no Banco X.\n");
        System.out.println(titularBanco);

        System.out.print("\nGostaria de depositar algum valor? Se sim, insira o valor desejado: ");
        double valorDeposito = sc.nextDouble();
        titularBanco.deposito(valorDeposito);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("\nRegistrando dados... (som de tec-tec-tec do teclado)");
        System.out.println("Pronto, dados registrados. Dados atualizados no Banco X.\n");
        System.out.println(titularBanco);

        System.out.print("\nGostaria de sacar algum valor? Se sim, insira o valor desejado: ");
        double valorSaque = sc.nextDouble();
        titularBanco.saque(valorSaque);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("\nRegistrando dados... (som de tec-tec-tec do teclado)");
        System.out.println("Pronto, dados registrados. Dados atualizados no Banco X.\n");
        System.out.println(titularBanco);

        System.out.println("\nFinalizando serviço...");
        System.out.println("Obrigada por usar nosso Banco. Você sempre será bem-vindo.");

        sc.close();
    }

}
