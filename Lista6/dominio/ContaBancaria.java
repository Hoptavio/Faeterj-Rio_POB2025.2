package dominio;

public class ContaBancaria {
    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$ " + String.format("%.2f", valor) + " concluido");
        } else {
            System.out.println("Deposito invalido");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + String.format("%.2f", valor) + " concluido");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Valor invalido");
        }
    }
    
    public void exibir() {
        System.out.println("Saldo disponivel R$: " + String.format("%.2f", saldo));
    }
            
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
}