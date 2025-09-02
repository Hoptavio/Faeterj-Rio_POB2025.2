import java.util.Scanner;

public class Idade
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		if(idade >=18) {
			System.out.print("Maior de idade");
		}
		else{
		    	System.out.print("Menor de idade");
		}
		scanner.close();
	}
}
