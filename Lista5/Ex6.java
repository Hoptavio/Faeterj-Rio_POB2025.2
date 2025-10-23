import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> numeros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== Ocorrências de um Número  ===");
        System.out.println("Digite seu numero: ");
        for(int i=0;i<5;i++){
            int num = sc.nextInt();
            numeros.add(num);
            System.out.println("Numero "+num+" adicionado");
        }
         int ocorrencia =0;
         System.out.println("Digite o numero para checagem de ocorrencia: ");
         int num = sc.nextInt();
         for(int i=0;i< numeros.size();i++){
            
             if(num == numeros.get(i)){
                ocorrencia++; 
             }
         }
          System.out.println("O numero "+num+" aparece "+ocorrencia+" vezes");
        sc.close();
    }
}
