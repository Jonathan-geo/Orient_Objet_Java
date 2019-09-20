
package Clube;

public class Pagamento {
    
    //ATRIBUTOS
    private int numeroBoleto;
    private double valor;
    private double multa;
    private double juros;
    private String dataVencimento;
    private String dataPagamento;
    private Socio socio; //Asociação com a classe Socio
    
    
    //CONSTRUTORES 
    public Pagamento(){
        numeroBoleto = 0;
        valor = 0;
        multa = 0;
        juros = 0;
        dataVencimento = "";
        dataPagamento = "";
        socio = null;
    }
    
    
    //METODOS
    public int getNumeroBoleto(){
        return numeroBoleto;
    }
    public void setNumeroBoleto(int novoNumeroBoleto){
        numeroBoleto = novoNumeroBoleto;
    }
        
    public double getValor(){
        return valor;
    }
    public void setValor(double novoValor){
        valor = novoValor;
    }
        
    public double getMulta(){
        return multa;
    }
    public void setMulta(double novoMulta){
        multa = novoMulta;
    }
    
    public double getJuros(){
        return juros;
    }
    public void setJuros(double novoJuros){
        juros = novoJuros;
    }
    
    public String getDataVencimento(){
        return dataVencimento;
    }
    public void setDataVencimento(String novoDataVencimento){
        dataVencimento = novoDataVencimento;
    }
    
    public String getDataPagamento(){
        return dataPagamento;
    }
    public void setDataPagamento(String novoDataPagamento){
        dataPagamento = novoDataPagamento;
    }
    
    //Como é uma associação de 1 para n, o pagamento tem relação 
    //1 com o socio logo utiliza-se só o método get set
    public Socio getSocio (){
        return socio;
    }
    public void setSocio (Socio novoSocio){
        socio = novoSocio;
    }
    

    
}
