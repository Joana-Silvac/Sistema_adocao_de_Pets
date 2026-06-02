package domain;

public class Adotante{
      private String nome;
       private CPF cpf;
         private Endereco endereco;
    public Adotante(String nome, CPF cpf, Endereco endereco){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome do indíviduo obrigatório");}
         if(cpf == null){
            throw new IllegalArgumentException("CPF do indíviduo obrigatório");}
         if (endereco == null){
            throw new IllegalArgumentException("Endereço do indíviduo obrigatório");}
         this.nome = nome;
           this.cpf = cpf;
        this.endereco = endereco;}
     public String getNome(){
        return nome;}
      public CPF getCpf(){
        return cpf;}
     public Endereco getEndereco(){
        return endereco;}}