import java.util.Scanner;

public class Maior18
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		if(idade >=18) {
			System.out.print("Maior de idade");
		}
	}
}
