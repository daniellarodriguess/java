package entidades;

public class Banco {

    private int numeroConta;
    private String nomeTitularConta; 
    private double saldoInicialConta;

    // Caso aja um depósito inicial 

    public Banco (int numeroConta, String nomeTitularConta, double saldoInicialConta) {

        this.numeroConta = numeroConta;
        this.nomeTitularConta = nomeTitularConta;
        this.saldoInicialConta = saldoInicialConta;

    }

    // Caso não aja um depósito inicial

    public Banco (int numeroConta, String nomeTitularConta) {

        this.numeroConta = numeroConta;
        this.nomeTitularConta = nomeTitularConta;

    }

    public int getNumeroConta() {

        return numeroConta;             // Apenas recebe o número da conta, não pode ser alterado

    }

    public String getNomeTitularConta() {

        return nomeTitularConta;

    }

    public void setNomeTitularConta(String nomeTitularConta) {

        this.nomeTitularConta = nomeTitularConta;

    }

    public double getSaldoInicialConta() {

        return saldoInicialConta;

    }

    public void deposito(double montate) {

        saldoInicialConta += montate;

    }

    public void saque(double montate) {

        saldoInicialConta -= montate + 5.0;

    }

    public String toString() {

        return "- Banco X -\n"
                + "\nNúmero da conta: " + numeroConta
                + "\nNome do titular da conta: " + nomeTitularConta
                + "\nSaldo Bancário: " + saldoInicialConta;

    }

}
