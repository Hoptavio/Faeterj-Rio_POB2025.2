import java.util.Scanner;

public class ConverteDistancia {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a distacia (KM) a ser convertida em metros");
		int dist = scanner.nextInt();
		dist = dist * 1000;
		System.out.print("A distacia em metros C):"+dist);
		scanner.close();
	}
}