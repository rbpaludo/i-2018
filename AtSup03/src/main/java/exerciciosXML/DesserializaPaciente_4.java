package exerciciosXML;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import exerciciosXML.paciente.Individuo;

/**
 * Classe para desserializar uma instância de Individuo armazenada em um arquivo .xml
 * @author rbpaludo
 *
 */
public class DesserializaPaciente_4 {
	
	/**
	 * Lê o arquivo .xml informado e desserializa-o, imprimindo o resultado. 
	 * @param args Nome do arquivo a ser lido
	 * @throws IOException Caso aconteça algum erro durante o armazenamento de algum arquivo. 
	 * 						Provavelmente por inexistência do arquivo informado.
	 * @throws ParseException Caso aconteça algum erro durante a serialização da instância criada. 
	 */
	public static void main(String[] args) throws IOException, ParseException {
		Path arquivoXML = Paths.get(args[0]);
		BufferedReader br = Files.newBufferedReader(arquivoXML, Charset.forName("UTF-8"));
		XmlMapper objectMapper = new XmlMapper();
		StringBuilder builder = new StringBuilder();
		String data;

		while ((data = br.readLine()) != null) {
			builder.append(data);
		}

		Individuo individuo = objectMapper.readValue(builder.toString().getBytes(), Individuo.class);

		System.out.println("E aqui está o indivíduo, novamente, em sua forma normal, depois da desserialização: \n " + 
		individuo.toString());
	}
}
