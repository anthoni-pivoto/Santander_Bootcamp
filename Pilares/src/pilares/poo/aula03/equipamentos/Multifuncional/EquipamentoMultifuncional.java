package pilares.poo.aula03.equipamentos.Multifuncional;

import pilares.poo.aula03.equipamentos.copiadora.Copiadora;
import pilares.poo.aula03.equipamentos.digitalizadora.Digitalizadora;
import pilares.poo.aula03.equipamentos.impressora.Impressora;

import java.awt.image.ImageProducer;
import java.sql.SQLOutput;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
}
