package ex2.controle;
import java.util.Scanner;
import ex2.dominio.Funcionario;

public class GerenciadorFuncionario{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = validarNome(sc);
        String categoria = validarCategoria(sc);
        double salario = validarSalario(sc);
        Funcionario funcionario = new Funcionario(nome,categoria,salario);

        funcionario.calcularSalarioFinal(nome,categoria, salario);

        sc.close();
    }
    public static String validarNome(Scanner sc){
         //Garantindo que o usuario forneça um nome valido 
         String nome;
         do {
         //Evita que o nome seja composto apenas por espaços(ex:"      ")
            System.out.println("Digite seu nome:");
             nome = sc.nextLine().trim();
             if(nome.isEmpty()){
                System.err.println("Nome invalido");
             }
         } while (nome.isEmpty());

         return nome;
    }
    
    public static String validarCategoria(Scanner sc) {
    String categoria;
    
        do {
            System.out.print("Digite a categoria (A, B ou C): ");
            categoria = sc.nextLine().trim().toUpperCase();
            
            switch (categoria) {
                case "A":
                case "B":
                case "C":
                    return categoria; 
                default:
                    System.err.println("Erro: Categoria deve ser A, B ou C!");
            }
        } while (true);
    }

    public static double validarSalario(Scanner sc){
        double salario; 
        do {
            System.out.println("Digite seu salario:");
            salario = sc.nextDouble();
            //Sempre limpar buffer de numeros ou .next
            sc.nextLine();
            if(salario >0){
                return salario;
            }
            System.err.println("Salario invalido");
        } while (true);
    }
}