package Lista1.Ex6;
import java.util.Scanner;
public class Ex6
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu salario: ");
		double salario = sc.nextDouble();
		double inss;

		if(salario <= 1518.00) {
			inss = 7.5 / 100;
		}
		else if(salario <= 2793.88) {
			inss = 9.0 / 100;
		}
		else if(salario <= 4190.84) {
			inss = 12.0 / 100;

		}
		else {
			inss = 14.0 / 100;
		}
        System.out.print("==Porcentagem de reducao== \n");
        System.out.print(inss*100);
        System.out.print("\n==Novo Salario==\n");
        System.out.print(("R$"+(float)+(salario-(salario*inss))));
		sc.close();
	}
}
