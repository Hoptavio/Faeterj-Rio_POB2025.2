package Lista1.Ex3;
import java.util.Scanner;
public class Ex3
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a temperatura : ");
		float C= scanner.nextFloat();
		System.out.print("==Celsius para Fahrenheit==");
		float F= ((C*9/5)+32);
		System.out.print(F);
		scanner.close();
	}
}
