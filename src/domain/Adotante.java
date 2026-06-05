package domain;

public class Adotante{
      private String nome;
      private CPF cpf;
      private Endereco endereco;
      private Email email;

    public Adotante(String nome, CPF cpf, Endereco endereco, Email email){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome do indíviduo obrigatório");}
         if(cpf == null){
            throw new IllegalArgumentException("CPF do indíviduo obrigatório");}
         if (endereco == null){
            throw new IllegalArgumentException("Endereço do indíviduo obrigatório");}
        if (email == null) {
            throw new IllegalArgumentException("Email do indivíduo obrigatório");}
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;}
     public String getNome(){
        return nome;}
      public CPF getCpf(){
        return cpf;}
     public Endereco getEndereco(){
        return endereco;}
public Email getEmail(){
    return email;}
}