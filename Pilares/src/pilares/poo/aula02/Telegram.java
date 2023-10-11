package pilares.poo.aula02;

public class Telegram extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }

    public void salvarHistoricoMensagem() {
        System.out.println("Salvando historico de mensagens ");
    }
}
