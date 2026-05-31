package src.domain;

public class Adotante {
        private String nome;
        private String idade;
        private String email;

        public Adotante(String nome, String idade, String email){
            this.nome=nome;
            this.idade=idade;
            this.email=email;
        }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }
}
