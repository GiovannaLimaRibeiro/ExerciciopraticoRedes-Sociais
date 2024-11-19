package funcionalidades;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    public Facebook(String senha, int numAmigos, Usuario user) {
        super(senha, numAmigos, user);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no funcionalidades.Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Fez um post no funcionalidades.Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentou no funcionalidades.Facebook!");
    }

    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação.");
    }

    public void compartilhar() {
        System.out.println("Compartilhou um post no funcionalidades.Facebook!");
    }

    public void fazStreaming() {
        System.out.println("Fazendo uma live funcionalidades.Facebook!");
    }
}