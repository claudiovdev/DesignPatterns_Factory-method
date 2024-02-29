package maladireta.maladireta.xml;

import com.algaworks.maladireta.MalaDireta;
import com.algaworks.maladireta.contato.Contatos;

public class MalaDiretaXML extends MalaDireta {

    private String nomeDoArquivo;

    public MalaDiretaXML(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosXML(nomeDoArquivo);
    }
}
