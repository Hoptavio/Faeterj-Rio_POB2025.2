package controle;
import java.util.Scanner;

import dominio.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==AGI & OTA===");

        System.out.println("Digite seu nome:");
        String titular = sc.nextLine();
        System.out.println("Digite seu saldo:");
        double saldoInicial = sc.nextDouble();
        ContaBancaria conta = new ContaBancaria(titular, saldoInicial);

        int opcao;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir Saldo");
            System.out.println("4 - Exibir Informações da Conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Valor a ser depositado: ");
                    double valorDeposito = sc.nextDouble(); // Corrigido: nextDouble()
                    conta.depositar(valorDeposito); // Corrigido: usar valorDeposito
                    break;

                case 2:
                    System.out.println("Valor a ser retirado: ");
                    double valorSaque = sc.nextDouble(); // Corrigido: nextDouble()
                    conta.sacar(valorSaque); // Corrigido: usar valorSaque
                    break;

                case 3:
                    conta.exibir();
                    break;
                    
                case 4:
                    System.out.println("===Dados da conta===");
                    System.out.println("Titular: " + conta.getTitular());
                    conta.exibir();
                    break;
                    
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 0);
        sc.close();
    }
}