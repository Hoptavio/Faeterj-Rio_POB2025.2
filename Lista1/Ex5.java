package Lista1.Ex5;
import java.util.Scanner;
public class Ex5
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a ano de seu nascimento: ");
		int nasc= scanner.nextInt();
		System.out.print("Digite o ano atual : ");
		int atual= scanner.nextInt();
		System.out.print("==Dias Vividos==");
		int dias= (atual-nasc)*365;
		System.out.print(dias);
		scanner.close();
	}
	
}
