import java.util.Scanner;

public class diferenca {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        // Introdução ao programa

        System.out.println("Iremos calcular a diferença entre os produtos 'A x B' e 'C x D'.");
        System.out.println();

        // Entrada de dados

        System.out.print("Digite o valor A, de tipo inteiro: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor B, de tipo inteiro: ");
        int b = sc.nextInt();
        System.out.print("Digite o valor C, de tipo inteiro: ");
        int c = sc.nextInt();
        System.out.print("Digite o valor D, de tipo inteiro: ");
        int d = sc.nextInt();

        // Cálculo de dados
        
        int primeiroProduto = a * b;
        int segundoProduto = c * d;

        int diferencaProdutosResultado = primeiroProduto - segundoProduto;

        // Saída de dados

        System.out.println("\nO valor da diferença entre os produtos 'A x B' e 'C x D' é: " + diferencaProdutosResultado);

        sc.close();
    }
}
