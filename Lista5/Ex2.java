import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    ArrayList<String> nomes = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== GERENCIADOR DE NOMES ===");
        System.out.println("Digite 5 nomes");
        int tam =5;
        for(int i=0;i< tam;i++){
            String nome = sc.nextLine();
            nomes.add(nome);
            
            System.out.println("Nome adicionado: " + nomes.get(i));
            
        }
        System.out.println("Digite um nome para ser removido:");
        String nomeRemover = sc.nextLine();
        if(nomes.remove(nomeRemover)){
            System.out.println("Nome'"+nomeRemover+"' removido");
            tam--;
        }else{
             System.out.println("Nome'"+nomeRemover+"' não encontrado");
        }
        for(int i=0;i< tam;i++){
            System.out.println("Nome adicionado: " + nomes.get(i));
        }
        sc.close();
    }
}
