package maladireta;

import com.algaworks.maladireta.MalaDireta;
import maladireta.maladireta.xml.MalaDiretaXML;

import javax.swing.*;

public class NovoClienteCadastrado {
    public static void main(String[] args) {
        MalaDireta malaDireta = new MalaDiretaXML("contatos.xml");
        String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail");

        boolean status = malaDireta.enviarEmail(mensagem);

        JOptionPane.showMessageDialog(null, "E-mails enviados: " + status);
    }
}
