package entities;

public class Estudante {
    
    public String alunoNome;
    public double notaUm;
    public double notaDois;
    public double notaTres;

    public double notaFinal() {

        return notaUm + notaDois + notaTres;

    }

    public double pontosFaltam() {

        if (notaFinal() < 60.0) {

            return 60.0 - notaFinal();

        }
        else {

            return 0.0;

        }

    }

}
