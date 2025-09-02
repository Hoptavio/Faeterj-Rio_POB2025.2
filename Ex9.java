
import java.util.Scanner;

public class Ex9 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a segunda nota: ");
		float nota1 = scanner.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float nota2 = scanner.nextFloat();
		float media = (nota1 + nota2)/2;
		System.out.println("média:"+media);;

		if(media>=7) {
            System.out.print("APROVADO");
		}
		else {
		     System.out.print("Digite a terceira nota: ");
            float nota3 = scanner.nextFloat();
            media = (nota1+nota2+(nota3*2))/4;
			if(media >=6) {
                System.out.print("APROVADO");
			}
			else{
			    System.out.print("REPROVADO");
			}
		}

		scanner.close();
	}
}
