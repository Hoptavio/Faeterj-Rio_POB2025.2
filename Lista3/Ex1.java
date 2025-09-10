
import java.util.Scanner;
public class Ex1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o N: ");
		int n = sc.nextInt();
		int soma=0;
		for(int i=0;i <=n;i++){
		    soma+= i;
		    System.out.print(soma);
		}
		
	}
}
