package maladireta;

import com.algaworks.maladireta.MalaDireta;
import maladireta.maladireta.csv.MalaDiretaCsv;

import javax.swing.*;

public class RelacionamentoCliente {
    public static void main(String[] args) {
        MalaDireta malaDireta = new MalaDiretaCsv("contatos.csv");
        String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail");

        boolean status = malaDireta.enviarEmail(mensagem);

        JOptionPane.showConfirmDialog(null,"E-mails enviados: " + status);
    }
}
