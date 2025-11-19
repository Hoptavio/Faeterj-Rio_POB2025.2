package ex5.dominio;

public class CaixaEletronico {
    double saldo;
    
    public CaixaEletronico(double saldo){
        this.saldo = saldo;
    }
    public void sacar(double valor){
        
        if(valor %10 == 0){
        System.out.println("Saque valido");
            if(saldo >= valor){
            saldo -= valor;
            System.out.println("Saque realizado");
             exibirSaldo();
            }
            else
            {
                System.out.println("Saldo insuficiente");
                 exibirSaldo();
            }
        }
        else{
            System.err.println("Saque não permitido");
             exibirSaldo();
        }
    }
    public void exibirSaldo(){
        System.out.println("Saldo atual: "+saldo);
    }
    public double getSaldo(){
        return saldo;
    }
}
