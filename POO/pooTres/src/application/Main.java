package application;

import java.util.Scanner;
import entities.Estudante;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("Informe os dados do aluno.");

        // Entrada de dados

        Estudante aluno = new Estudante();

        System.out.print("\nDigite o nome do aluno: ");
        aluno.alunoNome = sc.nextLine();

        System.out.print("\nDigite a primeira nota - o máximo é 30: ");
        aluno.notaUm = sc.nextDouble();
        System.out.print("Digite a segunda nota - o máximo é 35: ");
        aluno.notaDois = sc.nextDouble();
        System.out.print("Digite a terceira nota - o máximo é 35: ");
        aluno.notaTres = sc.nextDouble();

        // Saída de dados

        System.out.println("\nO aluno(a) " + aluno.alunoNome + ", em sua nota final, obteve: " + aluno.notaFinal());

        if (aluno.notaFinal() < 60) {

            System.out.println("\nAluno(a) reprovado(a). Faltam " + aluno.pontosFaltam() + "pontos.");

        }
        else {

            System.out.println("Aluno(a) aprovado(a)!");

        }

        sc.close();
    }

}
