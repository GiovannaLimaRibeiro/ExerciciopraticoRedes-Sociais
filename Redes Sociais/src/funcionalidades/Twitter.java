package funcionalidades;

public class Twitter extends RedeSocial implements Compartilhamento {
    public Twitter(String senha, int numAmigos, Usuario user) {
        super(senha, numAmigos, user);
    }
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no funcionalidades.Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Fez um post no funcionalidades.Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentou no algo no funcionalidades.Twitter!");
    }

    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no funcionalidades.Twitter!");
    }

    public void compartilhar() {
        System.out.println("Compartilhou um post no funcionalidades.Twitter!");
    }

}
