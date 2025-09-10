
import java.util.Scanner;
public class Ex4
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alunos;
		float notas=0;
		System.out.print("Digite o total de alunos na turma: ");
		alunos = sc.nextInt();
		for(int i=0;i<alunos;i++){
		    System.out.print("Nota do aluno "+(i+1)+": ");
		    notas += sc.nextFloat();
		}
		float media = notas / alunos;
		System.out.print("Media da turma = "+media);
	}
}
