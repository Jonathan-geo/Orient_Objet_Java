
package Clube;


public class Socio extends PessoaRegistrada{
    
    //ATRIBUTOS
    private String cpf;
    private String endereco;
    private String telefone;
    private String celular;
    private String email;
    private String foto;
    private String dataInicioTitulo;
    private String dataTerminoTitulo;
    
        //Iniciando atributos (associação com Dependente)
    private Dependente[] vetDependentes;
    private int contadorDependente;
    
        //Iniciando atributos (associação com Pagamentos)
        /*Neste caso eu iniciei a classe Pagamento como um vetor e armazenei
            na variavel vetPagametos*/
    private Pagamento[] vetPagamentos;
    private int contadorPagamento;
    
    
    //CONSTRUTORES
    public Socio(){
        super();
        cpf = "";
        endereco = "";
        telefone = "";
        celular = "";
        email = "";
        foto = "";
        dataInicioTitulo = "";
        dataTerminoTitulo = "";
        
            //Contrutor do atributo vetDependente (Vetor)
        vetDependentes = new Dependente[100];  
        contadorDependente = 0;
        
            //Construtor do atributo vetPagamento (Vetor)
        vetPagamentos = new Pagamento[100];
        contadorPagamento = 0;
    }
  
    //METODOS
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String novoCpf){
        cpf = novoCpf;
    }
    
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String novoEndereco){
        endereco = novoEndereco;
    }
    
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String novoTelefone){
        telefone = novoTelefone;
    }
 
    public String getCelular(){
        return celular;
    }
    public void setCelular(String novoCelular){
        celular = novoCelular;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String novoEmail){
        email = novoEmail;
    }
    
    public String getFoto(){
        return foto;
    }
    public void setFoto(String novoFoto){
        foto = novoFoto;
    }
    
    public String getDataInicioTitulo(){
        return dataInicioTitulo;
    }
    public void setDataInicioTitulo(String novoDataInicioTitulo){
        dataInicioTitulo = novoDataInicioTitulo;
    }
    
    public String getDataTerminoTitulo(){
        return dataTerminoTitulo;
    }
    public void setDataTerminoTitulo(String novoDataTerminoTitulo){
        dataTerminoTitulo = novoDataTerminoTitulo;
    }
    
        
    //Métodos que faz associação com a classe Pagamentos.
    //Cada socio tem vários pagamentos. Por isso o vetor.
    //Vetores necessitam de métodos que excluem, incluem, etc. 
    public void adicionarPagamento(Pagamento novoPagamento){
        vetPagamentos[contadorPagamento] = novoPagamento;
        contadorDependente++;
    } 
    public void excluirPagamento(int posicao){
        vetPagamentos[posicao] = vetPagamentos[contadorPagamento-1];
        vetPagamentos[contadorPagamento-1]=null;
        contadorPagamento--;
    }
    public Pagamento getPagamento(int posicao){
        return vetPagamentos[posicao];
    }
    public int qtdePagamentos(){
        return contadorPagamento;
    }
    
    
    //Métodos que faz associação com a classe Dependentes.
    //Cada socio tem vários dependentes. Por isso o vetor.
    //Vetor necessitam de métodos que excluem, incluem, etc. 
    public void adicionarDependente(Dependente novoDependente){
        vetDependentes[contadorDependente] = novoDependente;
        contadorDependente++;
    }
    public void excluirDependente(int posicao){
        vetDependentes[posicao] = vetDependentes[contadorDependente-1];
        vetDependentes[contadorDependente-1] = null;
        contadorDependente--;
    } 
    public Dependente getDependente(int posicao){
        return vetDependentes[posicao];
    } 
    public int qtdeDependentes(){
        return contadorDependente;
    } 
}



