package domain.aggregates;

import src.domain.Pet;
import domain.Adotante;
import src.domain.StatusPet;
import java.time.LocalDate;

public class ProcessoAdocao {
    private Pet pet;
    private Adotante adotante;
    private LocalDate dataDeSolicitacao;
    private String status;

    public ProcessoAdocao(Pet pet, Adotante adotante) {
        this.pet = pet;
        this.adotante = adotante;
        this.dataDeSolicitacao = LocalDate.now();
        this.status = "PENDENTE";
    }

    public boolean aprovar(){
        if (pet.getStatus() == StatusPet.EM_TRATAMENTO) {
            return false;
        }
        if (pet.getStatus() == StatusPet.ADOTADO){
            return false;
        }
        this.status = "APROVADO";
        pet.setStatus(StatusPet.ADOTADO);
        return true;
    }

    public Pet getPet() {
        return pet;
    }
    public Adotante getAdotante() {
        return adotante;
    }
    public LocalDate getDataDeSolicitacao() {
        return dataDeSolicitacao;
    }

    public String getStatus() {
        return status;
    }
}
