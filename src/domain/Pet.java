package src.domain;

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
    public void alterarStatus(StatusPet novoStatus){
        this.status = novoStatus;
    }

    public boolean estaAptoParaAdocao(){
        return status == StatusPet.DISPONIVEL;
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

    public StatusPet getStatus(){return status;}
}
