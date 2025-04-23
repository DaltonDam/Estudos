package envio;

public class MensagemEmail extends Mensagem implements CanalNotificacao {

    public MensagemEmail(String conteudo) {
        super(conteudo);
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviado por E-MAIL: " + mensagem);
    }

    @Override
    void enviar() {
        notificar("E-MAIL: " + conteudo);
    }
}
