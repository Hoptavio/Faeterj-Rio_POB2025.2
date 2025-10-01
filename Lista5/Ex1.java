import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> numeros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== GERENCIADOR DE NÚMEROS ===");
        System.out.println("Digite quantos números desejar. Para parar, digite 'sair'.");
        
        while(true){
              System.out.print("Digite um número (ou 'sair' para finalizar): ");
              String entrada = sc.nextLine();
              
              if(entrada.equalsIgnoreCase("sair")){
                  break;
              }
              try {
                  int numero = Integer.parseInt(entrada);
                  numeros.add(numero);
                  System.out.println("Número " + numero + " adicionado com sucesso!");
                  
              } 
              catch(Exception e) {
                  System.out.println("Entrada inválida! Digite apenas números ou 'sair'.");
              }
        }
        sc.close();
  System.out.println("\n=== NÚMEROS DIGITADOS ===");
        
        if (numeros.isEmpty()) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            System.out.println("Total de números digitados: " + numeros.size());
            System.out.println("Lista de números:");
            
            for (int i = 0; i < numeros.size(); i++) {
                System.out.println((i + 1) + ". " + numeros.get(i));
            }
            
        }
    }
}
