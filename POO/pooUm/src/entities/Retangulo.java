package entities;

public class Retangulo {

    public double base;
    public double altura;

    public double area() {

        return base * altura;

    }

    public double perimetro() {

        return (2 * base) + (2 * altura);

    }

    public double diagonal() {

        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura,2));

    }

    public String toString() {

        return "\nO valor da área é: " + String.format("%.2f", area()) + "\nO valor do perímetro é: " + String.format("%.2f", perimetro()) +"\nO valor da diagonal é: " + String.format("%.2f\n", diagonal());

    }

}
