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

    public String getSenha() {
        return senha;
    }


    public int getNumAmigos() {
        return numAmigos;
    }

    public void setNumAmigos(int numAmigos) {
        this.numAmigos = numAmigos;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public void curtirPublicacao(){
        System.out.println(" curtiu uma publicação!");
    };

}
