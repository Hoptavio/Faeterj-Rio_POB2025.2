package Lista1.Ex1;
import java.util.Scanner;
public class Ex1
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		int n = scanner.nextInt();
		System.out.print("Digite outro numero: ");
		int n2 = scanner.nextInt();
		int soma = n+n2;
		System.out.print("Soma entre numeros igual a: "+soma);
		scanner.close();
	}
	
}
