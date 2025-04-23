package envio;

public class MensagemSMS extends Mensagem implements CanalNotificacao {

    public MensagemSMS(String conteudo) {
        super(conteudo);
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviado por SMS: " + mensagem);
    }

    @Override
    void enviar() {
        notificar("SMS: " + conteudo);
    }
}
