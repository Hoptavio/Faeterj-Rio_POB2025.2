package ex4.dominio;

public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public boolean validarNota() {
        return nota >= 0 && nota <= 10;
    }

    public void classificarAluno() {
        if (!validarNota()) {
            System.out.println("Nota inválida! Deve estar entre 0 e 10.");
            return;
        }
        
        if (nota >= 7) {
            System.out.println("Aprovado");
        } 
        else if (nota >= 5) {
            System.out.println("Recuperação");
        } 
        else {
            System.out.println("Reprovado");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}