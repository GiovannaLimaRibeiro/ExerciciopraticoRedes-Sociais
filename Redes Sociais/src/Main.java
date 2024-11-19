import excecoes.LimiteUsuariosException;
import funcionalidades.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Criar usuário
            Usuario usuario = new Usuario("João", "joao@email.com");

            // Criar redes sociais
            RedeSocial facebook = new Facebook("senha123", 100, usuario);
            RedeSocial instagram = new Instagram("senha456", 200, usuario);

            // Associar redes sociais ao usuário
            usuario.adicionarRedeSocial(facebook);
            usuario.adicionarRedeSocial(instagram);

            // Exceder o limite de redes sociais
            RedeSocial twitter = new Twitter("senha789", 300, usuario);
            usuario.adicionarRedeSocial(twitter); // Deve lançar exceção

            // Usar redes sociais
            usuario.usarRedesSociais();

        } catch (LimiteUsuariosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}
