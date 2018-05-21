package exerciciosXML;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.xml.stream.XMLStreamException;

import org.codehaus.stax2.XMLInputFactory2;
import org.codehaus.stax2.XMLStreamReader2;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import exerciciosXML.calcados.calcado;
import exerciciosXML.calcados.Sapato;
import exerciciosXML.calcados.Tenis;

/**
 * Classe para leitura de um XML com registros de calçados e desserialização para output de tênis e sapatos.
 * 
 * @author rbpaludo
 *
 */
public class CarregaXML_2 {

	/**
	 * Lê o arquivo informado e imprime uma lista de Tênis e Sapatos
	 * 
	 * @param args Nome do arquivo a ser lido
	 * @throws IOException Caso aconteça algum erro durante o armazenamento de algum arquivo. 
	 * 						Provavelmente por inexistência do arquivo informado.
	 * @throws XMLStreamException Caso aconteça algum erro durante a serialização da instância criada. 
	 */
	public static void main(String[] args) throws IOException, XMLStreamException {
		Path arquivoXML = Paths.get(args[0]);
		BufferedReader br = Files.newBufferedReader(arquivoXML, Charset.forName("UTF-8"));
		StringBuilder builder = new StringBuilder();

		XMLInputFactory2 f = (XMLInputFactory2) XMLInputFactory2.newFactory();
		XMLStreamReader2 sr = (XMLStreamReader2) f.createXMLStreamReader(new FileInputStream(args[0]));
		XmlMapper objectMapper = new XmlMapper();

		calcado c = null;

		sr.next();
		sr.next();

		while(!sr.isEndElement()) {

			try {
				if (sr.getLocalName().equals("tenis")) {
					c = objectMapper.readValue(sr, Tenis.class);
				} else {
					c = objectMapper.readValue(sr, Sapato.class);
				}
			} catch(UnrecognizedPropertyException e) {
				System.out.println("Uma propriedade desconhecida foi encontrada. É provável que este arquivo contenha algum objeto"
						+ "não mapeado, portanto, não é utilizável nesta função.");
			}

			System.out.println(c.toString());

			sr.next();
		}

		System.out.println("------------------- \n");

		/*calcado[] calcados = new calcado[] {
			new Tenis("Corrida", "Rebok", 370.37f),
			new Sapato(new int[] {250, 250, 250}, "Pegada", 373.70f)
		};

		XmlMapper objMapper = new XmlMapper();

		String data = objMapper.writeValueAsString(calcados);

		Files.write(Paths.get("calcados.xml"), data.getBytes(), StandardOpenOption.APPEND);*/
	}
}
