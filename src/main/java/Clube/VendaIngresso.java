
package Clube;

public class VendaIngresso {
    private int numeroIngresso;
    private String data;
    private String hora;
    private double valor;
    private Show show;
    
    
    
    public VendaIngresso(){
        numeroIngresso = 0;
        data = "";
        hora = "";
        valor = 0;
        show = null;
    }
    
    public int getNumeroIngresso(){
        return numeroIngresso;
    }
    public void setNumeroIngresso(int novoNumeroIngresso){
        numeroIngresso = novoNumeroIngresso;
    }
    
    public String getData(){
        return data;
    }
    public void setData(String novoData){
        data = novoData;
    }
    
    public String getHora(){
        return hora;
    }
    public void setHora (String novoHora){
        hora = novoHora;
    }
    
    public double getValor(){
        return valor;
    }
    public void setValor(double novoValor){
        valor = novoValor;
    }
    
    //Associação simplies com a classe Show.
    public Show getShow(){
        return show;
    }
    public void setShow(Show novoShow){
        show = novoShow;
    }
}
