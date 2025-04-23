package envio;

public abstract class Mensagem {
    protected String conteudo;

    public Mensagem(String conteudo) {
        this.conteudo = conteudo;
    }

    abstract void enviar();
}
