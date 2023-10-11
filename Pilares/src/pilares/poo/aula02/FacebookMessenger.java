package pilares.poo.aula02;

public class FacebookMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando historico de mensagens ");
    }
}
