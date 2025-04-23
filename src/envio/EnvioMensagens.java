package envio;

public class EnvioMensagens {
    public static void main(String[] args) {
        Mensagem mensagemEmail = new MensagemEmail("Olá chat, essa é minha aplicação.");
        Mensagem mensagemSMS = new MensagemSMS("Seu código é 1423");
        Mensagem mensagemWhatsApp = new MensagemWhatsApp("Nova mensagem recebida!");

        mensagemEmail.enviar();
        mensagemSMS.enviar();
        mensagemWhatsApp.enviar();
        
    }
}
