package funcionalidades;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    public GooglePlus(String senha, int numAmigos, Usuario user) {
        super(senha, numAmigos, user);
    }
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no funcionalidades.GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Fez um post no  funcionalidades.GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentou no  funcionalidades.GooglePlus!");
    }

    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação do funcionalidades.GooglePlus!.");
    }


    public void compartilhar() {
        System.out.println("Compartilhou um post no  funcionalidades.GooglePlus!!");
    }

    public void fazStreaming() {
        System.out.println("Fazendo uma video conferência no funcionalidades.GooglePlus!");
    }

}
