package pilares.poo.aula02;

public class MSNMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");

    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando historico de mensagens ");
    }
}