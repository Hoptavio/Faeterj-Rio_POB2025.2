import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int[8];
		int tam = num.length;
		int par=0;
		for(int i=0;i<tam;i++){
		    System.out.print("Digite o numero para posição "+(i+1)+": ");
		    num[i] = sc.nextInt();
		}
		for(int i=0;i<tam;i++){
		    if(num[i]%2==0) par++;
		}
		System.out.print("Números pares encontrados: "+par);
	}
}
