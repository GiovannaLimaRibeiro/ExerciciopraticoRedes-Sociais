package funcionalidades;

public class Instagram extends RedeSocial {

    public Instagram(String senha,int numAmigos, Usuario user) {
        super(senha, numAmigos,user);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no funcionalidades.Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Comentou um post no funcionalidades.Instagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentou um post no funcionalidades.Instagram!");
    }

    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no funcionalidades.Instagram!");
    }
}
