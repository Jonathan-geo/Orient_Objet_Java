package Clube;

public class PessoaRegistrada extends Pessoa{
    
    private int numeroRegistro;
    private String dataNasc;
    
    
    public PessoaRegistrada(){
        
        super();
        numeroRegistro = 0;
        dataNasc = "";
    }
    
 
    
    public int getNumeroRegistro(){
        return numeroRegistro;
    }
    public void setNumeroRegistro(int novoNumeroRegistro){
        numeroRegistro = novoNumeroRegistro;
    }
    
    
    
    public String getDataNasc(){
        return dataNasc;
    }
    public void setDataNasc(String novaDataNasc){
        dataNasc = novaDataNasc;
    }
    
    
    
    
}
