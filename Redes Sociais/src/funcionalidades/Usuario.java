package funcionalidades;

import excecoes.ConexaoFalhouException;
import excecoes.LimiteUsuariosException;

import java.util.HashSet;

public class Usuario {
    private String nome;
    private String email;
    private HashSet<RedeSocial> redesSociais;

    public Usuario(String nome, String email) throws excecoes.ConexaoFalhouException {
        this.nome = nome;
        this.email = email;
        this.redesSociais = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }


    public HashSet<RedeSocial> getRedesSociais() {
        return redesSociais;
    }

    public void adicionarRedeSocial(RedeSocial redeSocial) throws LimiteUsuariosException {
        if (redesSociais.size() >= 2) {
            throw new LimiteUsuariosException("Limite de redes sociais atingido! Cada usuário pode ter no máximo 2 redes sociais.");
        }
        boolean adicionado = redesSociais.add(redeSocial);
        if (adicionado) {
            System.out.println("Rede social adicionada com sucesso!");
        } else {
            System.out.println("Essa rede social já está associada ao usuário.");
        }
    }

    public void usarRedesSociais() throws ConexaoFalhouException {
        for (RedeSocial rede : redesSociais) {
            String nomeRedeSocial = rede.getClass().getSimpleName(); // Obtém o nome da classe como o nome da rede social
            System.out.println("\nUsando a rede social: " + nomeRedeSocial);

            // Simula ações para cada rede social
            if (rede instanceof Facebook) {
                rede.postarFoto();
                ((Facebook) rede).compartilhar();
                ((Facebook) rede).fazStreaming();
            } else if (rede instanceof Instagram) {
                rede.postarVideo();
                rede.postarComentario();
                rede.curtirPublicacao();
            } else if (rede instanceof GooglePlus) {
                ((GooglePlus) rede).fazStreaming();
                ((GooglePlus) rede).compartilhar();
                rede.postarFoto();
            } else if (rede instanceof Twitter) {
                ((Twitter) rede).compartilhar();
                rede.curtirPublicacao();
                rede.postarVideo();
            }

            if (Math.random() > 0.7) {
                throw new ConexaoFalhouException("Erro de conexão ao tentar usar a rede social: " + nomeRedeSocial);
            }
        }
    }

}




