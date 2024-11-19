import excecoes.LimiteUsuariosException;
import funcionalidades.*;

public class Main {
    public static void main(String[] args) {
        try {

            Usuario usuario = new Usuario("Jade", "jade@gmail.com");

            RedeSocial facebook = new Facebook("jd123", 161, usuario);
            RedeSocial instagram = new Instagram("eucalipto57&", 250, usuario);

            usuario.adicionarRedeSocial(facebook);
            usuario.adicionarRedeSocial(instagram);


            RedeSocial twitter = new Twitter("iugbnernfj785", 78, usuario);
            usuario.adicionarRedeSocial(twitter);

            usuario.usarRedesSociais();

        } catch (LimiteUsuariosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}
