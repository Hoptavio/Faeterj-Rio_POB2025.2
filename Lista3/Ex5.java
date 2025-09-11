import java.util.Scanner;
public class Ex5
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Digite o primeiro número: ");
	    int n1 = sc.nextInt();
	    System.out.print("Digite o primeiro número: ");
	    int n2 = sc.nextInt();
	    
	    if(n1 > n2){
	        int temp = n2;
	        n2 = n1;
	        n1 = temp;
	    }
	    for(int i=n1;i<=n2;i++){
	        boolean primo = true;
	        
	        if(i <= 1){
	           primo = false;
	        }
	        else{
	            for(int j=2;j<i;j++){
	                if((i%j)==0){
	                    primo = false;
	                    break;
	                }
	            }
	        }
	        if(primo){
	            System.out.print(i+" É um número primo ");
	        }
	        else{
	            System.out.print(i+" Não é um número primo ");
	        }
	    }
	}
}
