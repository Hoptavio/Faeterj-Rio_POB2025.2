import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float [] num = new float[4];
		int tam = num.length;
		float media = 0;
		for(int i =0;i<tam;i++){
		    System.out.print("Digite o numero para posição "+(i+1)+": ");
		    num[i] = sc.nextFloat();
		    media+= num[i];
		}
		System.out.print(media+"\n");
		media = media / tam;
		System.out.print(media+"\n");
		System.out.print("===Resultado===\n");
		if(media>= 7.0){
		    System.out.print("Aprovado");
		}else{
		    System.out.print("Reprovado");
		}
	}
}
