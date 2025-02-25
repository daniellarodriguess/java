package calculos;

public class Conversao {

    public double cotacaoDolar;
    public int quantidadeDolar;
    private static double IOF;

    public double contaCotacao() {

        IOF = 0.06;
        double contaImposto = IOF * (cotacaoDolar * quantidadeDolar);
        
        return (cotacaoDolar * quantidadeDolar) + contaImposto;

    }

    public String toString() {

        return "\nA quantidade, em reais, que deve ser pago é: " + contaCotacao();

    }
}
