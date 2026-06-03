package domain.aggregates;

import domain.Pet;
import domain.Adotante;
import domain.StatusPet;

public class PetAggregate {

    private Pet pet;
    private Adotante adotante;
    private boolean adotado;

    public PetAggregate(Pet pet, Adotante adotante) {
        this.pet = pet;
        this.adotante = adotante;
        this.adotado = false;
    }

    public boolean podeSerAdotado() {
        if (pet.getStatus() == StatusPet.EM_TRATAMENTO){
            return false;
        }
        if (adotado){
            return false;
        }
        return true;
    }

    public void realizarAdocao(){
        if (!podeSerAdotado()){
            throw new IllegalStateException("Pet não pode ser adotado");
        }
        this.adotado = true;
        pet.setStatus(StatusPet.ADOTADO);
    }

    public Pet getPet() {
        return pet;
    }

    public Adotante getAdotante() {
        return adotante;
    }

    public boolean isAdotado() {
        return adotado;
    }
}