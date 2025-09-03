package Lista2.Ex7;
import java.util.Scanner;

public class Ex7
{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Digite o valor da base: ");
    	int base = sc.nextInt();
    	System.out.print("Digite o valor da altura:");
    	int altura = sc.nextInt();
    	System.out.print("==Valor da Area==\n");
    	int area = base * altura;
    	System.out.print(area);
    	System.out.print("\n==Valor do Perimetro==\n");
    	int perimetro = 2*(base + altura);
    	System.out.print(perimetro);
    	sc.close();
	}
}
