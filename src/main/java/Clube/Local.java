
package Clube;

public class Local {
    private String nome;
    private int qtdeMaxima;
    private String descricao;
    
    public Local(){
        nome = "";
        qtdeMaxima = 0;
        descricao = "";
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){
        nome = novoNome;
    }
    
    public int getQtdeMaxima(){
        return qtdeMaxima;
    }
    public void setQtdeMaxima(int novoQtdeMaxima){
        qtdeMaxima = novoQtdeMaxima;
    }
    
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao (String novoDescricao){
        descricao = novoDescricao;
    }
    
}
