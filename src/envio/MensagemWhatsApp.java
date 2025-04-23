package envio;

public class MensagemWhatsApp extends Mensagem implements CanalNotificacao {

    public MensagemWhatsApp(String conteudo) {
        super(conteudo);
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviado por WHATSAPP: " + mensagem);
    }

    @Override
    void enviar() {
        notificar("WHATSAPP: " + conteudo);
    }
}
