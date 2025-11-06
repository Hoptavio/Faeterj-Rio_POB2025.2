package ex3.dominio;
public class Elevador {
    int andarAtual;
    int totalAndares;

    public Elevador( int andarAtual,int totalAndares){

        //Validação na criação do cenário 
         if (totalAndares <= 0) {
            throw new IllegalArgumentException("Total de andares deve ser maior que zero");
        }
        if (andarAtual < 0 || andarAtual > totalAndares) {
            throw new IllegalArgumentException("Andar atual inválido");
        }
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;


    }
    public void subir(){

       if(this.andarAtual < this.totalAndares){
         System.out.println("Subindo...");
         this.andarAtual++;
         System.out.println("Você chegou ao andar número: "+this.andarAtual);
        }
        else{
         System.err.println("Você já esta no ultimo andar");
        }
        
    }
    public void descer(){
        
        if(andarAtual > 0){
         System.out.println("Descendo");
         this.andarAtual--;
         System.out.println("Você chegou ao andar número: "+this.andarAtual);
        }
        else{
         System.err.println("Você já está no térreo");
        } 
        
    }
    public void exibirAndar(){
        System.out.println("Andar atual: "+this.andarAtual);
    }
}
