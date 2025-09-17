import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int[6];
		int tam = num.length;
		for(int i =0;i<tam;i++){
		    System.out.print("Digite o numero para posição "+(i+1)+": ");
		    num[i] = sc.nextInt();
		}
			for(int i=tam-1;i>-1;i--){
			    System.out.print(num[i]);
			}
	}
}
