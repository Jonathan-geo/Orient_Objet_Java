package Clube;

    /*
     *Todo atributo privado não pode ser acessado de fora da classe. 
     *Pra isso nos precisamos dar acesso a esse atributo por meio de algo
     *que seja publica. Esse é o conceito de encapsulamento. 
     *Para isso devemos criar dois métodos. O método get que ira recuperar 
     *o valor do atributo e o método set que ira alterar o valor do atributo. 
     *
     */

/**
 *
 * @author jonathan
 */
public class Pessoa {
    
    private String nome;
    
    public Pessoa(){
        nome = "";
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String novoNome){
        nome = novoNome;
    }
}
