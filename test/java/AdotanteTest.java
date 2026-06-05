import domain.Email;
import domain.Adotante;
import domain.CPF;
import domain.Endereco;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdotanteTest {

    @Test
    void deveCriarAdotanteValido() {

        CPF cpf = new CPF("87945601252");

        Endereco endereco =
                new Endereco(
                        "Rua L",
                        "Bahia",
                        "BA",
                        "03000-000"
                );

        Email email = new Email("joyce@email.com");

        Adotante adotante =
                new Adotante(
                        "Joyce",
                        cpf,
                        endereco,
                        email
                );

        assertEquals("Joyce", adotante.getNome());
    }

    @Test
    void deveRejeitarCpfInvalido() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new CPF("879")
        );
    }

    @Test
    void deveRejeitarNomeVazio() {

        CPF cpf = new CPF("87945601252");

        Endereco endereco =
                new Endereco(
                        "Rua L",
                        "Bahia",
                        "BA",
                        "03000-000"
                );

        Email email = new Email("joyce@email.com");

        assertThrows(
                IllegalArgumentException.class,
                () -> new Adotante(
                        "",
                        cpf,
                        endereco,
                        email
                )
        );
    }
}