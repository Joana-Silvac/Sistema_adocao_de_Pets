package domain;

import domain.StatusPet;

public class Pet {
    private String nome;
    private String raca;
    private int idade;
    private  StatusPet status;


    public Pet(String nome, String raca,int idade, StatusPet status){

        if (idade < 0){
            throw new IllegalArgumentException("A idade não pode ser negativa!");
        }
        this.idade=idade;
        this.nome=nome;
        this.raca=raca;
        this.status=status;


    }

    public String getStatusDescricao(){
        if(status== StatusPet.DISPONIVEL){
            return "Pet disponível par adoção";
        } else if (status==StatusPet.EM_TRATAMENTO) {
            return "Pet em tratamento";
        }
        else{
            return "O pet não está disponivel";
        }
    }

    public void alterarStatus(StatusPet novoStatus){
        this.status = novoStatus;
    }

    public boolean estaAptoParaAdocao(){
        return status == StatusPet.DISPONIVEL;
    }

    public StatusPet getStatus() {
        return status;
    }

    public void setStatus(StatusPet status) {
        this.status = status;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }
}
