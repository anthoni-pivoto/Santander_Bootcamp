public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("123","Marquinhos");
        marcos.setEndereco("joao batis 187");

        System.out.println("Nome: " + marcos.getNome() + "\nCpf: " + marcos.getCpf() + "\nEndereco: " + marcos.getEndereco());
    }
}
