package excecoes;

public class LimiteUsuariosException extends RuntimeException {
    public LimiteUsuariosException(String mensagem) {
        super(mensagem);
    }
}
