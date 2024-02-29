package maladireta.maladireta.csv;

import com.algaworks.maladireta.MalaDireta;
import com.algaworks.maladireta.contato.Contatos;
import maladireta.csv.ContatosCSV;

public class MalaDiretaCsv extends MalaDireta {

    private String nomeDoArquivo;

    public MalaDiretaCsv(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosCSV(nomeDoArquivo);
    }
}
