
import java.util.Scanner;

public class Ex10 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu genero(F/M): ");
		char gen = scanner.next().charAt(0);
		gen = Character.toUpperCase(gen);
		if(gen =='M') {
			System.out.print("Digite sua idade: ");
			int idade = scanner.nextInt();
			if(idade>=18) {
				System.out.print("Serviço militar obrigatorio");
			}
			else {
				System.out.print("Insento do serviço militar(menor de idade)");
			}
		}
		else {
			System.out.print("Insento do serviço militar");
		}
		scanner.close();
	}
}
