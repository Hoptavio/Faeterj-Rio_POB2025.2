package Lista1.Ex4;
import java.util.Scanner;
public class Ex4
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a Nota1 : ");
		float n1= scanner.nextFloat();
		System.out.print("Digite a Nota2 : ");
		float n2= scanner.nextFloat();
		System.out.print("Digite a Nota3 : ");
		float n3= scanner.nextFloat();
		
		System.out.print("==Media das Notas==");
		float media= (n1+n2+n3)/3;
		System.out.print(media);
		scanner.close();
	}
	
}
