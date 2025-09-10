
import java.util.Scanner;
public class Ex3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do{
		System.out.print("digite o N: ");
	        n = sc.nextInt();
    	}while(n<=1);
	    
	    do{
	        System.out.print(n +"\n");
	        n--;
	    }while(n>=0);
	}
}
