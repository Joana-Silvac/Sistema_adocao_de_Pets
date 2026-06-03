
import domain.Adotante;
import domain.CPF;
import domain.Endereco;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AdotanteTest{
    @Test
    void deveCriarAdotanteValido(){
        CPF cpf = new CPF("87945601252");
        Endereco endereco =
                new Endereco(
                        "Rua L",
                        "Bahia",
                        "BA",
                        "03000-000"
                );
                Adotante adotante =
                new Adotante(
                        "Joyce",
                        cpf,
                        endereco
                );
        assertEquals("Joyce", adotante.getNome());}
    @Test
    void deveRejeitarCpfInvalido(){
        assertThrows(
                IllegalArgumentException.class,
                () -> new CPF("879")
        );}
    @Test
    void deveRejeitarNomeVazio(){
        CPF cpf = new CPF("87945601252");
                Endereco endereco =
                new Endereco(
                        "Rua L",
                        "Bahia",
                        "BA",
                        "03000-000"
                );
        assertThrows(
                IllegalArgumentException.class,
                () -> new Adotante("", cpf, endereco)
        );
    }}