import java.util.Scanner;
public class Eleitor
{
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o ano do seu nascimento: ");
		int num = scanner.nextInt();
		int resultado = 2025 - num;
		if(resultado >=16){
		    System.out.println("Apto a ser eleitor");
		}
		else{
		    System.out.println("Inapto a ser eleitor");
		}
		scanner.close();
	}
}
