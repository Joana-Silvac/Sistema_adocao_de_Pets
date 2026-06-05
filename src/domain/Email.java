package domain;

public class Email {

    private String endereco;

    public Email(String endereco) {

        if (endereco == null || endereco.isBlank()) {
            throw new IllegalArgumentException("Email é obrigatório!");
        }

        if (!endereco.contains("@")) {
            throw new IllegalArgumentException("Email inválido!");
        }

        String[] partes = endereco.split("@");

        if (partes.length != 2) {
            throw new IllegalArgumentException("Email inválido!");
        }

        if (partes[0].isBlank() || partes[1].isBlank()) {
            throw new IllegalArgumentException("Email inválido!");
        }

        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}