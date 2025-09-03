import java.util.Scanner;
public class Ex4
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu numero:");
		float num = scanner.nextFloat();
		int resultado = (int )(num % 2);
		if(resultado == 0){
		    System.out.println((int)num+" É um numero par");
		}
		else{
		    System.out.println((int)num+" É um numero impar");
		}
	}
}
