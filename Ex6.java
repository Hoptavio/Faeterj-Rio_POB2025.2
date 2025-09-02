import java.util.Scanner;

public class Ex6{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu gênero: ");
        char sexo = scanner.next().charAt(0);
        sexo = Character.toLowerCase(sexo);
        
        System.out.print("Digite seu salário: ");
        float salario = scanner.nextFloat();
        int resultado;
        if(sexo =='m'){
            salario = salario * 0.05f; 
            System.out.print("Aumento de salário no valor de: "+salario);
        }
        else{
           salario = salario * 0.03f;
           System.out.print("Aumento de salário no valor de: "+salario);
        }
        scanner.close();
    }
}
