package pilares.poo.aula03.estabelecimento;

import pilares.poo.aula03.equipamentos.Multifuncional.EquipamentoMultifuncional;
import pilares.poo.aula03.equipamentos.impressora.DeskJet;
import pilares.poo.aula03.equipamentos.impressora.Impressora;
import pilares.poo.aula03.equipamentos.impressora.LaserJet;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional EM = new EquipamentoMultifuncional();

        EM.imprimir();
        EM.copiar();
        EM.digitalizar();
    }
}
