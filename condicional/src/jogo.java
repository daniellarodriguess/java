import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // Introdução ao programa

        System.out.println("Iremos calcular a duração de um jogo, tendo a duração mínima de 1 hora e máxima de 24 horas. Tem-se em mente o formato de 24 horas.");

        // Entrada de dados

        int dia = 24;

        System.out.print("\nInforme o horário que você começou a jogar: ");
        int horarioInicio = sc.nextInt();

        System.out.print("Informe o horário que você parou de jogar: ");
        int horarioFinal = sc.nextInt();

        // Cálculo de dados 

        int totalHoras = 0;

        if (horarioInicio > horarioFinal) {

            totalHoras = dia - horarioInicio + horarioFinal;

        }
        else {

            totalHoras = horarioFinal - horarioInicio;

        }

        // Saída de dados

        if (totalHoras <= 24  && totalHoras >= 1) {

            System.out.println("\nO jogo durou " + totalHoras + " hora(s).");

        } 
        else {

            System.out.println("\nO jogo não encontra-se no limite de duração mencionado - entre 1 e 24 hora(s).");

        }

        sc.close();
    }
}
