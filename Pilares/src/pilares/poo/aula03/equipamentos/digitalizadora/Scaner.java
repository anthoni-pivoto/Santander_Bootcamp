package pilares.poo.aula03.equipamentos.digitalizadora;

import pilares.poo.aula03.equipamentos.digitalizadora.Digitalizadora;

public class Scaner implements Digitalizadora {
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando");
    }
}
