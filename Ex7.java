import java.util.Scanner;

public class Ex7{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
       System.out.print("Digite um numero: ");
       int num = scanner.nextInt();
       if(num != 0){
           if(num > 0){
               System.out.print("POSITIVO");
           }
           else{
               System.out.print("NEGATIVO");
           }
       }
       else{
           System.out.print("NULO");
       }
        scanner.close();
    }
}
