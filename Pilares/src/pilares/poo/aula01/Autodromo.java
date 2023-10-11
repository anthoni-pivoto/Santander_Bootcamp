package pilares.poo.aula01;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        Moto z400 = new Moto();
        z400.setChassi("897893");
        jeep.setChassi("379871");

        System.out.println(z400.getChassi() + jeep.getChassi());
        
    }
}
