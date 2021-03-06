package exerciciosXML;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import exerciciosXML.turma.Turma;

/**
 * Classe para fazer a leitura de um arquivo .xml com uma instância de Turma serializada e a desserialização desta instância, imprimindo o resultado
 * @author rbpaludo
 *
 */
public class ConverteXMLObj_3 {
	
	/**
	 * Chama a função para desserializar a instância de uma Turma
	 * @param args Nome do arquivo .xml com a instância de uma Turma serializada
	 * @throws IOException Caso aconteça algum erro durante o armazenamento de algum arquivo. 
	 * 						Provavelmente por inexistência do arquivo informado.
	 */
	public static void main(String[] args) throws IOException {
		desserializaTurma(args[0]);
	}
	
	public static void desserializaTurma(String arquivo) throws IOException {
		Path arquivoXML = Paths.get(arquivo);
		BufferedReader br = Files.newBufferedReader(arquivoXML/*, Charset.forName("UTF-8")*/);
		XmlMapper objectMapper = new XmlMapper();
		StringBuilder builder = new StringBuilder();
		String data;
		
		while ((data = br.readLine()) != null) {
			builder.append(data);
		}
		
		Turma turma = objectMapper.readValue(builder.toString().getBytes(), Turma.class);

		System.out.println("Esta é a Turma desserializada: \n\n");
		System.out.println(turma.toString());
	}
}
