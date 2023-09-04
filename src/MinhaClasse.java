public class MinhaClasse {
    public static void main(String[] args){
        int n1 = 3;
        int n2 = 4;
        int resultado = somar(n1, n2);
        System.out.println(resultado);
        String primeiroNome = "Anthoni";
        String segundoNome = "Pivoto ";
        String nomeCompleto;
        System.out.println(nomeCompleto = juntaString(primeiroNome, segundoNome));
    }
    public static int somar(int n1, int n2){
            return n1 + n2;
    } 
    public static String juntaString(String primeiraParte, String segundaParte){
        return primeiraParte.concat(" ").concat(segundaParte);
    }
}
