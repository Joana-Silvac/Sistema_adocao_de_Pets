package infrastructure;

import domain.Pet;

public class PetRepository {
        public void salvar(Pet pet) {
            System.out.println("Pet salvo: " + pet.getNome());
        }
    }