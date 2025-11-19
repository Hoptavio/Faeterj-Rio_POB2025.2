SimuladorCaixa.java
package ex5.controle;
import ex5.dominio.CaixaEletronico;
import java.util.Scanner;

public class SimuladorCaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double saldo = sc.nextDouble();
        CaixaEletronico cliente = new CaixaEletronico(saldo);
        
        do{
            System.out.println("Digite a operação desejada");
            System.out.println("1-Sacar");
            System.out.println("2-Exibir Saldo");
            System.out.println("3-Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    double valor = sc.nextDouble();
                    cliente.sacar(valor);
                    break;

                case 2:
                    cliente.exibirSaldo();
                    break;
                case 3:
                    System.out.println("Obrigado por utilizar nosso caixa");
                    break;

                default:

                    break;
            }
        }while(opcao != 3);
        System.err.println("Opição invalida");
        sc.close();
    }
}
