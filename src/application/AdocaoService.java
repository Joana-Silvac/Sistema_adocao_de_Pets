package application;

import domain.Adotante;
import domain.Pet;
import domain.aggregates.ProcessoAdocao;

public class AdocaoService {
    public boolean aprovarAdocao(Pet pet, Adotante adotante) {

        if (pet == null) {
            throw new IllegalArgumentException(
                    "Selecione um pet para continuar a adoção."
            );
        }

        if (adotante == null) {
            throw new IllegalArgumentException(
                    "Informe os dados do adotante para continuar a adoção."
            );
        }

        ProcessoAdocao processo = new ProcessoAdocao(pet, adotante);

        return processo.aprovar();
    }

}
