package Lista2.Ex10;
import java.util.Scanner;

public class Ex10
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor de x1: ");
		double x1 = sc.nextDouble();
		System.out.print("Digite o valor de y1: ");
		double y1 = sc.nextDouble();
		System.out.print("Digite o valor de x2: ");
		double x2 = sc.nextDouble();
		System.out.print("Digite o valor de y2: ");
		double y2 = sc.nextDouble();
		
		System.out.printf("\nCoordenadas do ponto 1: (%.2f, %.2f)", x1, y1);
        System.out.printf("\nCoordenadas do ponto 2: (%.2f, %.2f)", x2, y2);
        double dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.printf("\nDistância entre os pontos: %.4f", dist);
		sc.close();
	}
}
