package funcionalidades;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;
    protected Usuario user;

    public RedeSocial(String senha, int numAmigos, Usuario user) {
        this.senha = senha;
        this.numAmigos = numAmigos;
        this.user = user;

    }

    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public void curtirPublicacao(){
        System.out.println(" curtiu uma publicação!");
    };

}
