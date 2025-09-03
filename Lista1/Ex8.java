package Lista2.Ex8;
import java.util.Scanner;

public class Ex8
{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Digite o valor da raio: ");
    	double raio = sc.nextDouble();
        double pi = 3.14159;
        double v = (4.0/3.0)*pi*Math.pow(raio,3);
        System.out.print("==Valor do Volume==\n");
        System.out.print(v);
    	sc.close();
	}
}
