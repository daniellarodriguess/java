package entities;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() { 

        return salarioBruto - imposto;

    }
    
    public double aumento (double porcentagemAumento) {

      return (salarioBruto - imposto) + (salarioBruto * (porcentagemAumento/100));

    } 

    public String toString(){

        return "Nome do funcionário: " + nome + "\nSalário Líquido: R$ " + String.format("%.2f", salarioLiquido());

    }

}
