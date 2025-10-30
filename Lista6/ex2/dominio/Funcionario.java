package ex2.dominio;

public class Funcionario {
    String nome;
    String categoria;
    double salario;

    public Funcionario(String nome, String categoria, double salario){
        this.nome = nome;
        this.categoria = categoria;
        this.salario = salario;
    }
    public void calcularSalarioFinal(String nome,String categoria, double salario){
        if(categoria.equals("A")){
             System.out.println("Pré-Salário: "+String.format("%.2f",salario));
             salario *= 1.20; 
             System.out.println("Bem vindo "+nome+", seu salário total de categoria A: "+String.format("%.2f",salario));
        }
        else if(categoria.equals("B")){
             System.out.println("Pré-Salário : "+String.format("%.2f",salario));
             salario *= 1.10; 
             System.out.println("Bem vindo "+nome+", seu salário total de categoria B: "+String.format("%.2f",salario));
        }
        else{
             System.out.println("Bem vindo "+nome+", seu salário total de categoria C: "+String.format("%.2f",salario));
        }
    }
}
