public class SistemaIBGE {
    public static void main(String[] args) {
        for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla()  + ": " + e.getNome());
        }
        EstadoBrasileiro eb = EstadoBrasileiro.RIO_DE_JANEIRO;
        System.out.println(eb.getNomeMaiusculo());
    }
}
