package exerciciosXML;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe para fazer a leitura de um arquivo .csv de alunos e converter para um arquivo XML com os alunos contidos no .csv
 * @author rbpaludo
 *
 */
public class ConverteCSV_XML_1 {
	
	/**
	 * Lê o arquivo, com uma lista de alunos, informado e converte para um arquivo XML com os alunos lidos
	 * 
	 * @param args Nome do arquivo a ser lido
	 * @throws IOException Caso aconteça algum erro durante o armazenamento de algum arquivo. 
	 * 						Provavelmente por inexistência do arquivo informado.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String separaPor = ";";
		String data;
		String xmlData = "<alunos>\n";
		
		while((data = br.readLine()) != null) {
			
			String[] nomeEmail = data.split(separaPor);
			
			xmlData += "<aluno>\n";
			xmlData += "<nome>" + nomeEmail[0] + "</nome>\n";
			xmlData += "<email>" + nomeEmail[1] + "</email>\n";
			xmlData += "</aluno>\n";
		}
		
		xmlData += "</alunos>";
		
		FileOutputStream fos = new FileOutputStream(args[0].substring(0, args[0].length() - 3) + "xml");
		
		fos.write(xmlData.getBytes());

		br.close();
		fos.close();
	}
}
