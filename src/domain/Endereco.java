package domain;

public class Endereco{
    private String rua;
      private String cidade;
       private String estado;
    private String cep;
    public Endereco(String rua, String cidade, String estado, String cep){
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;}
    public String getRua(){
        return rua;}
      public String getCidade(){
        return cidade;}
    public String getEstado(){
        return estado;}
    public String getCep(){
        return cep;}}