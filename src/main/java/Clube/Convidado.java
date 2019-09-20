
package Clube;


public class Convidado extends Pessoa{
    
    private String documento;
    
    public Convidado(){
        super();
        documento = "";
    }
    
    public String getDocumento(){
        return documento;
    }
    
    public void setDocumento(String novoDocumento){
        documento = novoDocumento;
    }
            
}
