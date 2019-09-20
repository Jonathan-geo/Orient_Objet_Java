
package Clube;

public class Reserva {
    private String data;
    private int qtdePessoas;
    private String horarioInicio;
    private String horarioTermino;
    private String confirmada; 
    private String aprovada; 
    private String resumo; 
    
    public Reserva(){
        
        data = "";
        qtdePessoas = 0;
        horarioInicio = "";
        horarioTermino = "";
        confirmada = "";
        aprovada = "";
        resumo = "";
    }
    
    public String getData(){
        return data;
    }
    public void setData(String novoData){
        data = novoData;
    }
    
    public int getQtdePessoas(){
        return qtdePessoas;
    }
    public void setQtdePessoas(int novoQtdePessoas){
        qtdePessoas = novoQtdePessoas;
    }
    
    public String getHorarioInicio(){
        return horarioInicio;
    }
    public void setHorarioInicio(String novoHorarioInicio){
        horarioInicio = novoHorarioInicio;
    }
    
    public String getHorarioTermino(){
        return horarioTermino;
    }
    public void setHorarioTermino(String novoHorarioTermino){
        horarioTermino = novoHorarioTermino;
    }
    
    public String getConfirmada(){
        return confirmada;
    }
    public void setConfirmada(String novoConfirmada){
        confirmada = novoConfirmada;
    }
    
    public String getAprovada(){
        return aprovada;
    }
    public void setAprovada(String novoAprovada){
        aprovada = novoAprovada;
    }
    
    public String getResumo(){
        return resumo;
    }
    public void setResumo(String novoResumo){
        resumo = novoResumo;
    }
    
}


