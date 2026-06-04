package application;

import domain.Adotante;

public class RegistrarAdotanteService {

    public void registrarAdotante(Adotante adotante) {

        if (adotante == null) {
            throw new IllegalArgumentException("Informe os dados do adotante para continuar o cadastro.");
        }

        System.out.println("Adotante registrado: " + adotante.getNome());
    }
}