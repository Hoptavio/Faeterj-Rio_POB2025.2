package ex4.controle;
import java.util.Scanner;

import ex4.dominio.Aluno;

public class GerenciarAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        String nome = sc.nextLine();
        double nota;
        boolean valido = false;
       do{
            System.out.println("Digite a nota do aluno (0-10):");
            nota = sc.nextDouble();
            
            if (nota >= 0 && nota <= 10) {
                valido = true;
            } else {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
            }
        }while(!valido);
  
        Aluno aluno = new Aluno(nome, nota);
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota: " + aluno.getNota());
        System.out.print("Situação: ");
        aluno.classificarAluno();

        sc.close();
    }
}