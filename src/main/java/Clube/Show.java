
package Clube;

public class Show {
    
    //ATRIBUTOS
    private String data;
    private String horarioInicio;
    private String artista;
    private int inicioFaixaIngresso;
    private int fimFaixaIngresso;
    
        //Iniciando atributos (associação com a classe VendaIngresso)
    private VendaIngresso[] vetVendaIngressos;
    private int contadorVendaIngresso;
    
    
    //CONTRUTORES
    public Show(){
        data = "";
        horarioInicio = "";
        artista = "";
        inicioFaixaIngresso = 0;
        fimFaixaIngresso = 0;
        
            //construtor do atributo vetVendaIngressos 
            //(Associação com Venda ingressos)
        vetVendaIngressos = new VendaIngresso[1000];
        contadorVendaIngresso = 0;
    }
    
    
    
    //METODOS
            
    public String getData(){
        return data;
    }
    public void setData(String novoData){
        data = novoData;
    }
    
    public String getHorarioInicio(){
        return horarioInicio;
    }
    public void setHorarioInicio(String novoHorarioInicio){
        horarioInicio = novoHorarioInicio;
    }
    
    public String getArtista(){
        return artista;
    }
    public void setArtista(String novoArtista){
        artista = novoArtista;
    }
    
    public int getInicioFaixaIngresso(){
        return inicioFaixaIngresso;
    }
    public void setInicioFaixaIngresso(int novoInicioFaixaIngresso){
        inicioFaixaIngresso = novoInicioFaixaIngresso;
    }
    
    public int getFimFaixaIngresso(){
        return fimFaixaIngresso;
    }
    public void setFimFaixaIngresso(int novoFimFaixaIngresso){
        fimFaixaIngresso = novoFimFaixaIngresso;
    }
    
    //Métodos que faz associação com a classe VendaIngresso.
    //Cada Show tem vários ingressos. Por isso o vetor.
    //Vetor necessitam de métodos que excluem, incluem, etc. 
    public void adicionarVendaIngresso(VendaIngresso novoVendaIngresso){
        vetVendaIngressos[contadorVendaIngresso] = novoVendaIngresso;
        contadorVendaIngresso++;
    }       
    public void excluirVendaIngresso(int posicao){
        vetVendaIngressos[posicao] = vetVendaIngressos[contadorVendaIngresso-1];
        vetVendaIngressos[contadorVendaIngresso-1] = null;
        contadorVendaIngresso--;
    }      
    public VendaIngresso getVendaIngresso(int posicao){
        return vetVendaIngressos[posicao];
    }
    public int qtdeVendaIngresso(){
        return contadorVendaIngresso;
    }
    
}


