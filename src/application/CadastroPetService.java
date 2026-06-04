package application;
import domain.Pet;
import infrastructure.PetRepository;

public class CadastroPetService {

        private PetRepository petRepository;

        public CadastroPetService(PetRepository petRepository) {
            this.petRepository = petRepository;
        }

        public void cadastrarPet(Pet pet) {

            if (pet == null) {
                throw new IllegalArgumentException(
                        "Informe os dados do pet para continuar o cadastro."
                );
            }

            petRepository.salvar(pet);
        }
    }