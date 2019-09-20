
package Clube;

public class Dependente extends PessoaRegistrada{
    
    private String parentesco;
    
    //Atributo de ligação com a classe Socio
    private Socio socio;
    
    
    
    
    public Dependente(){
        super();
        parentesco = "";
        
        //Contrutor do atributo socio.
        socio = null;
    }
    
    //Adicionando o objeto socio no atributo socio. 
    //Cada dependente tem um socio. 
    public Socio getSocio(){
        return socio;
    }
    public void setSocio(Socio novoSocio){
        socio = novoSocio;
    }
      
    
    
    public String getParentesco(){
        return parentesco;
    }
    public void setParentesco(String novoParentesco){
        parentesco = novoParentesco;
    }
    
}
