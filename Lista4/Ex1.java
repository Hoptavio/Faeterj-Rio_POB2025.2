import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int[5];
		int tam = num.length;
		int maior = Integer.MIN_VALUE;
		for(int i =0;i<tam;i++){
		    System.out.print("Digite o numero para posição "+(i+1)+": ");
		    num[i] = sc.nextInt();
		    if(maior<num[i]) maior = num[i];
		}
		System.out.print("Maior valor: "+maior);
	}
}
