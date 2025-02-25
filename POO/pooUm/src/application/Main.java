package application;

import java.util.Scanner;
import entities.Retangulo;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa
        
        System.out.println("Iremos lhe ajudar com o cálculo da área, do perímetro e da diagonal de um triângulo.");
        System.out.println("A seguir, insira a base e a altura, respectivamente.");

        // Entrada de dados 

        Retangulo ret = new Retangulo();

        System.out.print("\nInforme a base: ");
        ret.base = sc.nextDouble();
        System.out.print("Informe a altura: ");
        ret.altura = sc.nextDouble();
        
        // Saída de dados

        System.out.println(ret.toString());

        sc.close();

    }
}
