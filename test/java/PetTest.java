
import org.junit.jupiter.api.Test;
import domain.Pet;
import src.domain.StatusPet;

import static org.junit.jupiter.api.Assertions.*;

public class PetTest {

    @Test
    void deveCriarPetComSucesso() {

        Pet pet = new Pet(
                "Rex",
                "Labrador",
                3,
                StatusPet.DISPONIVEL
        );

        assertEquals("Rex", pet.getNome());
        assertEquals("Labrador", pet.getRaca());
        assertEquals(3, pet.getIdade());
    }

    @Test
    void deveLancarExcecaoQuandoIdadeForNegativa() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Pet(
                        "Rex",
                        "Labrador",
                        -1,
                        StatusPet.DISPONIVEL
                )
        );
    }

    @Test
    void deveAlterarStatusDoPet() {

        Pet pet = new Pet(
                "Rex",
                "Labrador",
                2,
                StatusPet.DISPONIVEL
        );

        pet.alterarStatus(StatusPet.ADOTADO);

        assertEquals(
                StatusPet.ADOTADO,
                pet.getStatus()
        );
    }

    @Test
    void deveEstarAptoParaAdocaoQuandoDisponivel() {

        Pet pet = new Pet(
                "Rex",
                "Labrador",
                2,
                StatusPet.DISPONIVEL
        );

        assertTrue(
                pet.estaAptoParaAdocao()
        );
    }

    @Test
    void naoDeveEstarAptoParaAdocaoQuandoEmTratamento() {

        Pet pet = new Pet(
                "Rex",
                "Labrador",
                2,
                StatusPet.EM_TRATAMENTO
        );

        assertFalse(
                pet.estaAptoParaAdocao()
        );
    }
}