package pilares.poo.aula01;

public class Carro extends Veiculo{
    
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio(){
        System.out.println("Cambio esta em P");
    }
}
