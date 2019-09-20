
package Clube;

public class Show {
    private String data;
    private String horarioInicio;
    private String artista;
    private int inicioFaixaIngresso;
    private int fimFaixaIngresso;
    
    public Show(){
        data = "";
        horarioInicio = "";
        artista = "";
        inicioFaixaIngresso = 0;
        fimFaixaIngresso = 0;
    }
    
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
    
}


