import java.util.Scanner;

public class MaiorNum
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro numero : ");
		int num1 = scanner.nextInt();
		
		System.out.print("Digite o segundo numero : ");
		int num2 = scanner.nextInt();
		if(num1>=num2) {
			System.out.print("o maior numero digitado foi: "+num1);
		}
		else {
			System.out.print("o maior numero digitado foi: "+num2);
		}
	}
}
