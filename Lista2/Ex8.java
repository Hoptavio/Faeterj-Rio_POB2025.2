
import java.util.Scanner;

public class Ex8{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
       System.out.print("Numeros de materias abaixo da média: ");
       int num = scanner.nextInt();
       if(num != 0){
           if(num > 5){
               System.out.print("REPROVADO");
           }
           else{
               System.out.print("RECUPERAÇÃO");
           }
       }
       else{
           System.out.print("APROVADO");
       }
        scanner.close();
    }
}
