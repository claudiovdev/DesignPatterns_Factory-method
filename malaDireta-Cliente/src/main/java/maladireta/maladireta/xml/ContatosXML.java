package maladireta.maladireta.xml;

import com.algaworks.maladireta.contato.Contato;
import com.algaworks.maladireta.contato.Contatos;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ContatosXML implements Contatos {

    private String nomeArquivo;

    public ContatosXML(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public List<Contato> listarContatos() {
        List<Contato> contatos = new ArrayList<>();

        try {
            // Obtém o fluxo de entrada do arquivo usando o caminho relativo ao diretório de recursos
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nomeArquivo);
            if (inputStream != null) {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(inputStream);
                doc.getDocumentElement().normalize();

                NodeList nodeList = doc.getElementsByTagName("contato");

                for (int i = 0; i < nodeList.getLength(); i++) {
                    Element element = (Element) nodeList.item(i);
                    String nome = element.getElementsByTagName("nome").item(0).getTextContent();
                    String email = element.getElementsByTagName("email").item(0).getTextContent();
                    Contato contato = new Contato(nome, email);
                    contatos.add(contato);
                }
            } else {
                System.err.println("Arquivo " + nomeArquivo + " não encontrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return contatos;
    }
}
