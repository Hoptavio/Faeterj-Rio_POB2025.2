package ex3.controle;
import java.util.Scanner;
import ex3.dominio.Elevador;

public class SimuladorElevador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Digite o andar atual: ");
        int andarAtual = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o total de andares: ");
        int totalAndares = Integer.parseInt(scanner.nextLine());

        Elevador elevador = new Elevador(andarAtual,totalAndares);

        do {
            System.out.println("Menu do elevador");
            System.out.println("1-Subir");
            System.out.println("2-Descer");
            System.out.println("3-Exibir");
            System.out.println("4-Sair");
            //Não vou precisar limpar o buffer se usar o scanner assim
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    elevador.subir();
                    break;
                case 2:
                    elevador.descer();
                    break;
                case 3:
                    elevador.exibirAndar();
                    break;
                case 4:
                     System.out.println("Obrigado por utilizar o elevador");
                    break;

                default:
                System.err.println("Opção inválida, escolha uma opção entre 1 e 4");
                    break;
            }
        } while (opcao != 4);
        scanner.close();
    }
}