package domain;

public class Pet {
    private String nome;
    private String raca;
    private String idade;
    private StatusPet status;

    public Pet(String nome, String raca,String idade, StatusPet status){
        this.idade=idade;
        this.nome=nome;
        this.raca=raca;
        this.status=status;


    }

    public String getStatus(){
        if(status== StatusPet.DISPONIVEL){
            return "Pet disponível par adoção";
        } else if (status==StatusPet.EM_TRATAMENTO) {
            return "Pet em tratamento";
        }
        else{
            return "O pet não está disponivel";
        }

    }

    public String getNome(){
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }
}
