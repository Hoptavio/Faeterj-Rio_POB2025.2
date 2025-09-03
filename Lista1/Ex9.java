package Lista2.Ex9;
import java.util.Scanner;

public class Ex9
{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Digite o saldo R$: ");
    	float real = sc.nextFloat();
    	System.out.print("Digite a cotação do dolar: ");
    	float cota = sc.nextFloat();
    	float dolar = real * cota;
    	System.out.printf("Você tem o equivalente a %.2f dolares",dolar);
    	
    	sc.close();
	}
}
