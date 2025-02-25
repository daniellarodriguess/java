import java.util.Scanner;

public class areas {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        // Introdução ao programa

        System.out.println("Informe o valor das áreas solicitadas, de acordo com os valores A, B e C: ");
        System.out.println();

        // Entrada de dados

        double pi = 3.14159;

        System.out.print("Primeiramente, informe o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Segundamente, informe o valor de B: ");
        double b = sc.nextDouble();
        System.out.print("Terceiramente, informe o valor de C: ");
        double c = sc.nextDouble();

        // Cálculo de dados

        double triangulo = (a * c)/2;
        double circulo = pi * Math.pow(c, 2);
        double trapezio = ((a + b) * c)/2;
        double quadrado = Math.pow(b, 2);
        double retangulo = a * b;

        // Saída de dados

        System.out.printf("\nA área do triângulo retângulo que tem A por base e C por altura:  %.3f\n", triangulo);
        System.out.printf("A área do círculo de raio C: %.3f\n", circulo);
        System.out.printf("A área do trapézio que tem A e B por bases e C por altura: %.3f\n", trapezio);
        System.out.printf("A área do quadrado que tem lado B: %.3f\n", quadrado);
        System.out.printf("A área do retângulo que tem lados A e B: %.3f\n", retangulo);

        sc.close();
    }
}
