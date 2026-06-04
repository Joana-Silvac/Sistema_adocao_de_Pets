import domain.*;
import domain.aggregates.ProcessoAdocao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProcessoAdocaoTest {

    private Adotante criarAdotanteValido() {
        CPF cpf = new CPF("87945601252");

        Endereco endereco = new Endereco(
                "Rua A",
                "João Pessoa",
                "PB",
                "58000-000"
        );

        return new Adotante(
                "Thomas",
                cpf,
                endereco
        );
    }

    @Test
    void deveAprovarAdocaoDePetDisponivel() {

        Pet pet = new Pet(
                "Max",
                "Vira-lata",
                2,
                StatusPet.DISPONIVEL
        );

        Adotante adotante = criarAdotanteValido();

        ProcessoAdocao processoAdotivo = new ProcessoAdocao(pet, adotante);

        boolean resultado = processoAdotivo.aprovar();
        assertTrue(resultado);
        assertEquals(
                StatusPet.ADOTADO,
                pet.getStatus()
        );
    }

    @Test
    void deveNegarAdocaoDePetEmTratamento() {
        Pet pet = new Pet(
                "Max",
                "Vira-lata",
                2,
                StatusPet.EM_TRATAMENTO
        );

        Adotante adotante = criarAdotanteValido();

        ProcessoAdocao processoAdotivo = new ProcessoAdocao(pet, adotante);

        boolean resultado = processoAdotivo.aprovar();
        assertFalse(resultado);
    }

    @Test
    void deveNegarAdocaoDePetJaAdotado() {

        Pet pet = new Pet(
                "Max",
                "Vira-lata",
                2,
                StatusPet.ADOTADO
        );

        Adotante adotante = criarAdotanteValido();

        ProcessoAdocao processoAdotivo = new ProcessoAdocao(pet, adotante);

        boolean resultado = processoAdotivo.aprovar();
        assertFalse(resultado);
    }

}
