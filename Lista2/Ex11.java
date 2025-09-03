
import java.util.Scanner;

public class Ex11 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();
        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();
        
        if( (A+B<C)||(A+C<B)||(B+C<A)){
            System.out.print("Não é um triângulo");
        }
        else{
            System.out.print("É um triângulo");
        }
	
		scanner.close();
	}
}
