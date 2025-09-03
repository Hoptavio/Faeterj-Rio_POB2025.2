package Lista1.Ex2;
import java.util.Scanner;
public class Ex2
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double pi = 3.14159;
		System.out.print("Digite o raio: ");
		int raio = scanner.nextInt();
		System.out.print("==Area do circulo==");
		double area = pi *(raio*raio);
		System.out.print(area);
		scanner.close();
	}
	
}
