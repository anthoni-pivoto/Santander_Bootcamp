package pilares.poo.aula02;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    public abstract void salvarHistoricoMensagem();

    protected void validarConexaoInternet(){
        System.out.println("validando conexão com internet");
        System.out.println("validado podemos seguir em frente");
    }

}
