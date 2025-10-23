import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    ArrayList<Double> numeros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== SOMA E CALCULO DE MEDIA ===");
        System.out.println("Insira seus numeros, Digite '-1' para sair");
        while(true){
            double numero = sc.nextDouble();
            if(numero == -1){
                break;
            }
            numeros.add(numero);
            System.out.println("Numero: "+numero+" adcionado com sucesso");
        }
        double soma=0;
        for(int i=0; i < numeros.size();i++){
             soma += numeros.get(i);
        }
        System.out.println(soma);
        double media = soma/numeros.size();
        System.out.println(media);
        sc.close();
    }
}
